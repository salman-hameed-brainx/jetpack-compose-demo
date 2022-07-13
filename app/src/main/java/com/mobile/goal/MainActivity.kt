package com.mobile.goal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.mobile.goal.common.DistantRaceProgress
import com.mobile.goal.domain.events.AppEvents
import com.mobile.goal.domain.events.AppUiEventClass
import com.mobile.goal.navigation.AppNavGraph
import com.mobile.goal.navigation.HomeNavRoute
import com.mobile.goal.ui.core.BottomNavigation
import com.mobile.goal.ui.theme.AppTheme
import com.mobile.goal.ui.theme.lightGray
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
   // @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, true)
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainView()
                }
            }
        }
       progressLoadingObserver()
    }

    private fun progressLoadingObserver(){
        lifecycleScope.launch{
            AppEvents.eventFlow.collectLatest {
                when(it){
                    is AppUiEventClass.ShowProcessLoading->{
                        if (it.isLoading)
                            showProgress()
                        else
                            hideProgress()
                    }
                }
            }
        }
    }

    private fun showProgress(
        title: String = "",
        isCancellable: Boolean = false,
        timeOut: Long? = null
    ) {
        if (isFinishing) return
        DistantRaceProgress.showProgress(this, title, isCancellable = isCancellable, timeOut = timeOut)
    }


    private fun hideProgress() {
        DistantRaceProgress.dismissProgress()
    }
}

@OptIn(ExperimentalAnimationApi::class, ExperimentalPagerApi::class)
@Composable
fun MainView() {
    val navController = rememberAnimatedNavController()
    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(Color.Transparent)

    Scaffold(
        backgroundColor = lightGray,
        bottomBar = { if (isBottomNavVisible(navController)) BottomNavigation(navController) }
    ) {
        AppNavGraph(navController)
    }
}

@Preview(showBackground = true)
@Composable
fun mainScreenPreview() {
    MainView()
}

@Composable
private fun isBottomNavVisible(navController: NavHostController): Boolean {
    return when (currentRoute(navController = navController)) {
        HomeNavRoute.Home.route,
        HomeNavRoute.Search.route,
        HomeNavRoute.Workout.route,
        HomeNavRoute.Notifications.route,
        HomeNavRoute.Profile.route -> true
        else -> false
    }
}

@Composable
private fun currentRoute(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}