package com.mobile.goal.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.*
import com.google.accompanist.navigation.animation.composable

sealed class CompetitionNavRoute(var title: String, var route: String) {
    // Bottom Nav routes
    object CompetitionDetail : CompetitionNavRoute("Competition Detail", "competition-detail")
    object CompetitionDetailQuestion :
        CompetitionNavRoute("Competition Question", "competition-question")

    object PickATeam : CompetitionNavRoute("Pick A Team", "competition-pick-a-team")
    object Participants : CompetitionNavRoute("Participants", "competition-participants")
    object ParticipantsDetails :
        CompetitionNavRoute("Participants Details", "competition-participants-details")

    object CreateTeam : CompetitionNavRoute("Create A Team", "competition-create-team")
}


@OptIn(ExperimentalMaterialApi::class, ExperimentalAnimationApi::class)
fun NavGraphBuilder.competition(navController: NavController) {
    navigation(startDestination = HomeNavRoute.Home.route + "{code}", route = "route/competition") {
        // Competition
        composable(
            arguments = listOf(
                navArgument("code") { type = NavType.StringType }),
            route = CompetitionNavRoute.CompetitionDetail.route + "/{code}",
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) {
        }
    }
    navigation(
        startDestination = HomeNavRoute.Home.route + "{code}",
        route = "route/competition_question"
    ) {
        // Competition
        composable(
            arguments = listOf(
                navArgument("code") { type = NavType.StringType },
                navArgument("distance") { type = NavType.IntType }),
            route = CompetitionNavRoute.CompetitionDetailQuestion.route + "/{code}" + "/{distance}",
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) {
        }
    }

    navigation(
        startDestination = HomeNavRoute.Home.route + "{code}", route = "route/competition_pickATeam"
    ) {
        composable(
            arguments = listOf(
                navArgument("code") { type = NavType.StringType }),
            route = CompetitionNavRoute.PickATeam.route + "/{code}",
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) {
        }
    }

    navigation(
        startDestination = HomeNavRoute.Home.route + "{code}",
        route = "route/competition_participants"
    ) {
        composable(
            arguments = listOf(
                navArgument("code") { type = NavType.StringType }),
            route = CompetitionNavRoute.Participants.route + "/{code}",
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) {
        }
    }

    navigation(
        startDestination = HomeNavRoute.Home.route + "{code}",
        route = "route/competition_participants_detail"
    ) {
        composable(
            arguments = listOf(
                navArgument("code") { type = NavType.StringType }),
            route = CompetitionNavRoute.ParticipantsDetails.route + "/{code}",
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) {
        }
    }
    navigation(
        startDestination = HomeNavRoute.Home.route + "{code}",
        route = "route/competition_participants_detail"
    ) {
        composable(
            arguments = listOf(
                navArgument("code") { type = NavType.StringType }),
            route = CompetitionNavRoute.ParticipantsDetails.route + "/{code}",
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) {
        }
    }
    navigation(
        startDestination = HomeNavRoute.Home.route + "{code}",
        route = "route/competition_participants_detail"
    ) {
        composable(
            arguments = listOf(
                navArgument("code") { type = NavType.StringType }),
            route = CompetitionNavRoute.CreateTeam.route + "/{code}",
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) {
        }
    }
}