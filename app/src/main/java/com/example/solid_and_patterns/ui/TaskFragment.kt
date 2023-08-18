package com.example.solid_and_patterns.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.solid_and_patterns.R


class TaskFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private lateinit var viewModel: TaskViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el diseño de la interfaz de usuario
        val view = inflater.inflate(R.layout.fragment_task, container, false)

        // Inicializar el ViewModel
        viewModel = ViewModelProvider(this)[TaskViewModel::class.java]

        // Configurar la lógica de la interfaz de usuario y la interacción con el ViewModel
        // (Por ejemplo, botones para agregar, actualizar y eliminar tareas)

        return view
    }
}