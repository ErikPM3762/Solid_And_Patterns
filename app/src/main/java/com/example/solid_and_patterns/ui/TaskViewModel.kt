package com.example.solid_and_patterns.ui

import androidx.lifecycle.ViewModel
import com.example.solid_and_patterns.data.TaskRepository
import com.example.solid_and_patterns.domain.Task


/**
 * El ViewModel en la arquitectura MVVM actúa como un intermediario entre la lógica de presentación y la lógica
 * de negocio/almacenamiento. Ayuda a separar las responsabilidades y mejora la modularidad y mantenibilidad de la aplicación
 * al tiempo que facilita la gestión del estado de la interfaz de usuario y las acciones del usuario.
 */

class TaskViewModel : ViewModel() {
    private val repository = TaskRepository()

    fun saveTask(task: Task) {
        repository.saveTask(task)
    }

    fun updateTask(task: Task) {
        repository.updateTask(task)
    }

    fun deleteTask(task: Task) {
        repository.deleteTask(task)
    }

    fun getTasks(): List<Task> {
        return repository.getTasks()
    }
}
