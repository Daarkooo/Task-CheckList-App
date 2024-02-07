package com.example.checklist

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

data class CheckListTask(
    val id: Int,
    val label: String,
    var checked: Boolean = false
)