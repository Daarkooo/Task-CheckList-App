package com.example.checklist

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import java.nio.file.StandardWatchEventKinds

class CheckListViewModel : ViewModel(){
    private val _tasks = getCheckListTasks().toMutableStateList()
    val tasks : List<CheckListTask>
        get( ) = _tasks

    fun remove(item: CheckListTask){
        _tasks.remove(item)
    }

}

private fun getCheckListTasks() = List(32){ i -> CheckListTask(i, "Task # $i") }