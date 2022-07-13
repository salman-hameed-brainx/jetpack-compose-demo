package com.mobile.goal.domain.events

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

sealed class AppUiEventClass {
    data class ShowProcessLoading(val isLoading: Boolean) : AppUiEventClass()
}

object AppEvents{
    private val _eventFlow =  MutableSharedFlow<AppUiEventClass>()
    val eventFlow = _eventFlow.asSharedFlow()

    suspend fun updateEvent(event:AppUiEventClass){
        when(event){
            is AppUiEventClass.ShowProcessLoading->{
                _eventFlow.emit(event)
            }
        }
    }
}