package com.example.checklist

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.checklist.CheckListTask
import com.example.checklist.CheckListTaskItem

@Composable
fun CheckListTasks(
    list: List<CheckListTask>,
    onCheckedTask: (CheckListTask, Boolean) -> Unit,
    onCloseTask: (CheckListTask) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    ){
        items(
            items = list,
            key = {task -> task.id} // in the the data class
        ){task->
            CheckListTaskItem(
                taskName = task.label,
                checked = task.checked,
                onCheckedChange = { checked -> onCheckedTask(task, checked) },
                onClose = { onCloseTask(task) }
                )
        }
    }
}