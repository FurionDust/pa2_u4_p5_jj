package com.uce.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.repository.modelo.Persona;
import com.uce.edu.service.IPersonaService;

//http://localhost:8085/personas/buscar
//http://localhost:8085/personas/actualizar
//http://localhost:8085/personas/borrar
//http://localhost:8085/personas/guardar
//http://localhost:8085/personas/buscarTodos

@Controller
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private IPersonaService iPersonaService;

	// Diferentes tipos de request
	// verbos o metodos HTTP

	@GetMapping("/buscarTodos")
	private String buscarTodos(Model modelo ) {
		List<Persona> lista = this.iPersonaService.consultarTodos();
		modelo.addAttribute("personas",lista);
		return "vistaListaPersonas";
	}

	// Path
	// GET
	@GetMapping("/buscar")
	private String buscarPorCedula(String cedula) {

		return "";
	}

	@PutMapping("/actualizar")
	private String actualizar() {

		return "";
	}

	@DeleteMapping("/borrar")
	private String borrar() {

		return "";
	}

	@PostMapping("/guardar")
	private String guardar() {

		return "";
	}

}
