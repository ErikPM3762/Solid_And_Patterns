package com.example.solid_and_patterns.incorrectClassPatterns

import java.util.Date

/**
 * No se está cumpliendo completamente. El SRP establece que una clase debería tener una sola razón para
 * cambiar, lo que implica que cada clase debería tener una única responsabilidad clara y definida.
 * En este caso, la clase Task parece tener más de una responsabilidad.
 */
class TaskNotSRP {
    var title: String = ""
    var dueDate: Date? = null
    var isCompleted: Boolean = false

    fun saveTaskToDatabase() {
        // Lógica para guardar la tarea en la base de datos
    }

    fun updateTaskInDatabase() {
        // Lógica para actualizar la tarea en la base de datos
    }

    fun deleteTaskFromDatabase() {
        // Lógica para eliminar la tarea de la base de datos
    }

    fun sendNotification() {
        // Lógica para enviar una notificación relacionada con la tarea
    }
}