package com.example.solid_and_patterns.data

import com.example.solid_and_patterns.domain.Task


/**
 * Clean Architecture -->
 * La clase TaskRepository, se encarga de manejar la persistencia
 * y el acceso a los datos. Esto asegura una separación clara entre la lógica de negocio en la capa de dominio y
 * los detalles de almacenamiento en la capa de datos, lo que mejora la modularidad y la mantenibilidad de la aplicación.
 */
class TaskRepository {
    // Simulación de base de datos en memoria
    private val tasks = mutableListOf<Task>()

    fun saveTask(task: Task) {
        tasks.add(task)
    }

    fun updateTask(task: Task) {
        val existingTask = tasks.find { it.title == task.title }
        existingTask?.let {
            it.dueDate = task.dueDate
            it.isCompleted = task.isCompleted
        }
    }

    fun deleteTask(task: Task) {
        tasks.remove(task)
    }

    fun getTasks(): List<Task> {
        return tasks.toList()
    }
}