package com.example.solid_and_patterns.domain

import java.util.Date


/**
 * Clean Architecture -->
 * Task es una abstracción con propiedades como title, dueData y isCompleted.
 * Estos atributos estan directamente relacionados con la logica de negocio.
 */

class Task {
    var title: String = ""
    var dueDate: Date? = null
    var isCompleted: Boolean = false
}