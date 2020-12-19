package com.wanandroid.base

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * Created by Donkey
 * on 2020/8/8
 */
open class BaseViewModel : com.zxn.mvvm.viewmodel.BaseViewModel<Nothing>() {

    fun launchOnUI(block: suspend CoroutineScope.() -> Unit) {

        viewModelScope.launch { block() }

    }
}