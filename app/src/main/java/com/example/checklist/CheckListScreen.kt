package com.example.checklist

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun CheckListScreen(modifier: Modifier = Modifier){

//    val list = remember {        ---------------------- other version --------------
//        mutableStateListOf<CheckListTask>().apply {
//            addAll(getChecklistTasks())
//        }
//
//    }
    val list = remember { getChecklistTasks().toMutableStateList() }
    CheckListTasks(list =list, onCloseTask = {task -> list.remove(task)})

}

private fun getChecklistTasks() = List(25){i -> CheckListTask(i, "Task # $i") }