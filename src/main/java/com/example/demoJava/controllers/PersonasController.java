package com.example.demoJava.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoJava.models.Persona;



@RestController
@RequestMapping("/personas")
public class PersonasController {

	@GetMapping("/list")
	public List<Persona> listarPersonas(){
		List<Persona> personas = new ArrayList<>();
		Persona p = new Persona();
		p.setId("1");
		p.setNombre("Jairo");
		p.setEdad("29");
		personas.add(p);
		return personas;
	}
}
