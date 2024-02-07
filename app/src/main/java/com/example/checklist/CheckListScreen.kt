package com.example.checklist

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun CheckListScreen(
    modifier: Modifier = Modifier,
    checkListViewModel: CheckListViewModel = viewModel()
){

    val list = remember { getChecklistTasks().toMutableStateList() }
    CheckListTasks(list =list, onCloseTask = {task -> list.remove(task)})

}

private fun getChecklistTasks() = List(25){i -> CheckListTask(i, "Task # $i") }