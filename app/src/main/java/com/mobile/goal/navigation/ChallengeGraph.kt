package com.mobile.goal.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.*
import com.google.accompanist.navigation.animation.composable

sealed class ChallengeNavRoute(var title: String, var route: String) {
    // Bottom Nav routes
    object ChallengeDetail : ChallengeNavRoute("Challenge Detail", "challenge-detail")
    object ChallengeDetailQuestion : ChallengeNavRoute("Challenge Question", "challenge-question")
    object PickATeam : ChallengeNavRoute("Pick A Team", "challenge-pick-a-team")
    object Participants : CompetitionNavRoute("Participants", "challenge-participants")
    object ParticipantsDetails :
        CompetitionNavRoute("Participants Details", "challenge-participants-details")

    object CreateTeam :
        CompetitionNavRoute("Create A Team", "challenge-create-team")
}


@OptIn(ExperimentalMaterialApi::class, ExperimentalAnimationApi::class)
fun NavGraphBuilder.challenge(navController: NavController) {
    navigation(startDestination = HomeNavRoute.Home.route + "{code}", route = "route/challenge") {
        // Challenge
        composable(
            arguments = listOf(
                navArgument("code") { type = NavType.StringType }),
            route = ChallengeNavRoute.ChallengeDetail.route + "/{code}",
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) {
        }
    }
    navigation(
        startDestination = HomeNavRoute.Home.route + "{code}",
        route = "route/challenge_question"
    ) {
        // Challenge
        composable(
            arguments = listOf(
                navArgument("code") { type = NavType.StringType }),
            route = ChallengeNavRoute.ChallengeDetailQuestion.route + "/{code}",
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) {
        }
    }

    navigation(
        startDestination = HomeNavRoute.Home.route + "{code}", route = "route/challenge_pickATeam"
    ) {
        composable(
            arguments = listOf(
                navArgument("code") { type = NavType.StringType }),
            route = ChallengeNavRoute.PickATeam.route + "/{code}",
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) {
        }
    }

    navigation(
        startDestination = HomeNavRoute.Home.route + "{code}",
        route = "route/challenge_participants"
    ) {
        composable(
            arguments = listOf(
                navArgument("code") { type = NavType.StringType }),
            route = ChallengeNavRoute.Participants.route + "/{code}",
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) {
        }
    }

    navigation(
        startDestination = HomeNavRoute.Home.route + "{code}",
        route = "route/challenge_participants_detail"
    ) {
        composable(
            arguments = listOf(
                navArgument("code") { type = NavType.StringType }),
            route = ChallengeNavRoute.ParticipantsDetails.route + "/{code}",
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) {}
    }
    navigation(
        startDestination = HomeNavRoute.Home.route + "{code}",
        route = "route/challenge_create_team"
    ) {
        composable(
            arguments = listOf(
                navArgument("code") { type = NavType.StringType }),
            route = ChallengeNavRoute.CreateTeam.route + "/{code}",
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) {}
    }
}