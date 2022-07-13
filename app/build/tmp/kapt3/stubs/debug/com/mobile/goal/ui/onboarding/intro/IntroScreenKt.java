package com.mobile.goal.ui.onboarding.intro;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\b\u0010\t\u001aB\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007\u001a\u0010\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0019"}, d2 = {"DotsIndicator", "", "totalDots", "", "selectedIndex", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unSelectedColor", "DotsIndicator-0YGnOg8", "(IIJJ)V", "IntroContent", "imageId", "title", "", "message", "pagerState", "Lcom/google/accompanist/pager/PagerState;", "navController", "Landroidx/navigation/NavController;", "isLast", "", "viewModel", "Lcom/mobile/goal/ui/onboarding/intro/IntroViewModel;", "IntroScreen", "navigateToWelcome", "app_debug"})
public final class IntroScreenKt {
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {com.google.accompanist.pager.ExperimentalPagerApi.class})
    public static final void IntroScreen(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {com.google.accompanist.pager.ExperimentalPagerApi.class})
    public static final void IntroContent(int imageId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.google.accompanist.pager.PagerState pagerState, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, boolean isLast, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.ui.onboarding.intro.IntroViewModel viewModel) {
    }
    
    private static final void navigateToWelcome(androidx.navigation.NavController navController) {
    }
}