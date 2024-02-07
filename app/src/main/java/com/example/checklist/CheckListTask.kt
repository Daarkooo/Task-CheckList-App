package com.example.checklist

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class CheckListTask(
    val id: Int,
    val label: String,
    initialChecked: Boolean = false
){
    var checked: Boolean by mutableStateOf(initialChecked)
}