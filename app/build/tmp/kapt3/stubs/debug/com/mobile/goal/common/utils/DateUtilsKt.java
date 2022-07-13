package com.mobile.goal.common.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b+\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001e\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001aU\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0012\u001a\u001a\u0010\u0013\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u001a\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u001a\u0006\u0010\u0017\u001a\u00020\n\u001a!\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u001c\u001a\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020\u001f\u001aZ\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\"0!2\b\u0010#\u001a\u0004\u0018\u00010\n2\b\u0010$\u001a\u0004\u0018\u00010\u00012\b\u0010%\u001a\u0004\u0018\u00010\u00012\u0006\u0010&\u001a\u00020\u00012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010(\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u0001H\u0007\u001a\u001c\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002\u001a\u001c\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030!2\u0006\u0010,\u001a\u00020\u0019H\u0002\u001a\u001a\u0010-\u001a\u00020\u00192\b\u0010.\u001a\u0004\u0018\u00010\n2\b\u0010/\u001a\u0004\u0018\u00010\n\u001a\u0010\u00100\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020\u001f\u001a\u001c\u00101\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u001a\u000e\u00102\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\b\u001a\u000e\u00103\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\b\u001a\u001c\u00104\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u001a\u001c\u00105\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u001a\u0010\u00106\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\u0019\u001a\u001c\u00107\u001a\u00020\u00192\b\u00108\u001a\u0004\u0018\u00010\n2\b\u00109\u001a\u0004\u0018\u00010\nH\u0007\u001a\u0010\u0010:\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\u0019\u001a\u001e\u0010;\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\b2\u0006\u0010<\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u0003\u001a\u001c\u0010>\u001a\u00020\n*\u0004\u0018\u00010\n2\u0006\u0010<\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u0003\u001a\u001e\u0010?\u001a\u00020\u0001*\u0004\u0018\u00010\n2\u0006\u0010@\u001a\u00020\u00012\u0006\u0010A\u001a\u00020\u0001H\u0007\u001a2\u0010B\u001a\u00020\u0001*\u00020\b2\u0006\u0010@\u001a\u00020\u00012\b\b\u0002\u0010C\u001a\u00020\u000e2\b\b\u0002\u0010D\u001a\u00020\u000e2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0001\u001a4\u0010B\u001a\u00020\u0001*\u0004\u0018\u00010\n2\u0006\u0010@\u001a\u00020\u00012\b\b\u0002\u0010C\u001a\u00020\u000e2\b\b\u0002\u0010D\u001a\u00020\u000e2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0001\u001a\u000e\u0010E\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\n\u001a6\u0010F\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\u00012\u0006\u0010@\u001a\u00020\u00012\b\b\u0002\u0010C\u001a\u00020\u000e2\b\b\u0002\u0010G\u001a\u00020\u000e2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0001\u001a\u0014\u0010H\u001a\u00020\u000e*\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\n\u001a\f\u0010I\u001a\u00020\u000e*\u0004\u0018\u00010\b\u001a\n\u0010J\u001a\u00020\u000e*\u00020\n\u001a\u000e\u0010K\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\n\u001a\n\u0010L\u001a\u00020\b*\u00020\b\u00a8\u0006M"}, d2 = {"formatTime", "", "seconds", "", "minutes", "hours", "formatTimeWithDetails", "getCalender", "Ljava/util/Calendar;", "date", "Ljava/util/Date;", "add", "addType", "shouldResetSecond", "", "shouldResetToStartMonth", "shouldStartOfDay", "shouldEndOfMonth", "(Ljava/util/Date;Ljava/lang/Integer;IZZZZ)Ljava/util/Calendar;", "getCombineStartEndDate", "start", "end", "getCurrentDateStringFormat", "getCurrentDeviceTime", "getDaysDifferenceOfDates", "", "date1", "date2", "(Ljava/util/Date;Ljava/util/Date;)Ljava/lang/Long;", "getReportTimeText", "time", "", "getTimeConcatString", "", "", "dateTime", "hour", "mint", "dayTime", "locale", "dateFormat", "timeFormat", "getTimeDetails", "getTimeDifference", "mills", "getTimeDifferenceInSec", "startDate", "currentDate", "getTimerText", "isCurrentDate", "isDateInFuture", "isDateInPast", "isSameDay", "isSameMonth", "timeDetailsDifferenceString", "timeDifference", "startDateTime", "endDateTime", "timeDifferenceString", "addCalender", "dateType", "value", "addTime", "convertDateToTimeString", "dateFormatter", "timeFormatter", "formatDateIntoString", "shouldAddLocale", "enableTimeZone", "getDateStringWithoutTimeZone", "getDateTimeFromDateString", "timeZoneEnable", "isTomorrow", "isWeekend", "isYesterday", "toCalendar", "utcToLocal", "app_debug"})
public final class DateUtilsKt {
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getCurrentDateStringFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Date getCurrentDeviceTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getTimerText(double time) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatTime(int seconds, int minutes, int hours) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getReportTimeText(double time) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatTimeWithDetails(int seconds, int minutes, int hours) {
        return null;
    }
    
    private static final java.util.Map<java.lang.String, java.lang.Integer> getTimeDetails(double time) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final long timeDifference(@org.jetbrains.annotations.Nullable()
    java.util.Date startDateTime, @org.jetbrains.annotations.Nullable()
    java.util.Date endDateTime) {
        return 0L;
    }
    
    private static final java.util.Map<java.lang.String, java.lang.Integer> getTimeDifference(long mills) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String timeDifferenceString(long mills) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String timeDetailsDifferenceString(long mills) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.util.Map<java.lang.String, java.lang.Object> getTimeConcatString(@org.jetbrains.annotations.Nullable()
    java.util.Date dateTime, @org.jetbrains.annotations.Nullable()
    java.lang.String hour, @org.jetbrains.annotations.Nullable()
    java.lang.String mint, @org.jetbrains.annotations.NotNull()
    java.lang.String dayTime, @org.jetbrains.annotations.Nullable()
    java.lang.String locale, @org.jetbrains.annotations.NotNull()
    java.lang.String dateFormat, @org.jetbrains.annotations.NotNull()
    java.lang.String timeFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Date addTime(@org.jetbrains.annotations.Nullable()
    java.util.Date $this$addTime, int dateType, int value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.util.Calendar addCalender(@org.jetbrains.annotations.Nullable()
    java.util.Calendar $this$addCalender, int dateType, int value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.util.Calendar toCalendar(@org.jetbrains.annotations.Nullable()
    java.util.Date $this$toCalendar) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getDateStringWithoutTimeZone(@org.jetbrains.annotations.Nullable()
    java.util.Date $this$getDateStringWithoutTimeZone) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatDateIntoString(@org.jetbrains.annotations.Nullable()
    java.util.Date $this$formatDateIntoString, @org.jetbrains.annotations.NotNull()
    java.lang.String dateFormatter, boolean shouldAddLocale, boolean enableTimeZone, @org.jetbrains.annotations.Nullable()
    java.lang.String locale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatDateIntoString(@org.jetbrains.annotations.NotNull()
    java.util.Calendar $this$formatDateIntoString, @org.jetbrains.annotations.NotNull()
    java.lang.String dateFormatter, boolean shouldAddLocale, boolean enableTimeZone, @org.jetbrains.annotations.Nullable()
    java.lang.String locale) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.util.Date getDateTimeFromDateString(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$getDateTimeFromDateString, @org.jetbrains.annotations.NotNull()
    java.lang.String dateFormatter, boolean shouldAddLocale, boolean timeZoneEnable, @org.jetbrains.annotations.Nullable()
    java.lang.String locale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String convertDateToTimeString(@org.jetbrains.annotations.Nullable()
    java.util.Date $this$convertDateToTimeString, @org.jetbrains.annotations.NotNull()
    java.lang.String dateFormatter, @org.jetbrains.annotations.NotNull()
    java.lang.String timeFormatter) {
        return null;
    }
    
    public static final long getTimeDifferenceInSec(@org.jetbrains.annotations.Nullable()
    java.util.Date startDate, @org.jetbrains.annotations.Nullable()
    java.util.Date currentDate) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Calendar getCalender(@org.jetbrains.annotations.Nullable()
    java.util.Date date, @org.jetbrains.annotations.Nullable()
    java.lang.Integer add, int addType, boolean shouldResetSecond, boolean shouldResetToStartMonth, boolean shouldStartOfDay, boolean shouldEndOfMonth) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Calendar utcToLocal(@org.jetbrains.annotations.NotNull()
    java.util.Calendar $this$utcToLocal) {
        return null;
    }
    
    public static final boolean isSameDay(@org.jetbrains.annotations.Nullable()
    java.util.Date date1, @org.jetbrains.annotations.Nullable()
    java.util.Date date2) {
        return false;
    }
    
    public static final boolean isSameMonth(@org.jetbrains.annotations.Nullable()
    java.util.Date date1, @org.jetbrains.annotations.Nullable()
    java.util.Date date2) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Long getDaysDifferenceOfDates(@org.jetbrains.annotations.Nullable()
    java.util.Date date1, @org.jetbrains.annotations.Nullable()
    java.util.Date date2) {
        return null;
    }
    
    public static final boolean isWeekend(@org.jetbrains.annotations.Nullable()
    java.util.Calendar $this$isWeekend) {
        return false;
    }
    
    public static final boolean isDateInFuture(@org.jetbrains.annotations.NotNull()
    java.util.Calendar date1) {
        return false;
    }
    
    public static final boolean isDateInPast(@org.jetbrains.annotations.NotNull()
    java.util.Calendar date1) {
        return false;
    }
    
    public static final boolean isCurrentDate(@org.jetbrains.annotations.Nullable()
    java.util.Calendar date1, @org.jetbrains.annotations.Nullable()
    java.util.Calendar date2) {
        return false;
    }
    
    public static final boolean isYesterday(@org.jetbrains.annotations.NotNull()
    java.util.Date $this$isYesterday) {
        return false;
    }
    
    public static final boolean isTomorrow(@org.jetbrains.annotations.NotNull()
    java.util.Date $this$isTomorrow, @org.jetbrains.annotations.Nullable()
    java.util.Date date) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getCombineStartEndDate(@org.jetbrains.annotations.Nullable()
    java.lang.String start, @org.jetbrains.annotations.Nullable()
    java.lang.String end) {
        return null;
    }
}