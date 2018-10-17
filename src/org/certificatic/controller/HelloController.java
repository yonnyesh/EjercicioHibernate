package org.certificatic.controller;



import java.util.List;

import org.certificatic.model.Alumno;
import org.certificatic.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	@RequestMapping("/")
	public String hello(Model model) {
		
		System.out.println("Entro a helloController:::");
		
		Alumno alumno = new Alumno();
		model.addAttribute("alumno", alumno);

		return "AlumnoRegistro";
		
	}
	
	@RequestMapping("/test")
	public void test() {
		System.out.println(":: Entro a test");
		
	}
	
	@RequestMapping("/guardarAlumno")
	public String guardarAlumno(@ModelAttribute("alumno") Alumno alumno) {
		System.out.println("::: Registro Alumno ::::");
		System.out.println(alumno);
		alumnoService.save(alumno);
		
		return "AlumnoRegistro";
	}
	
	@RequestMapping("/mostrarLista")
	public String mostrarLista() {
		System.out.println(":::Entro a mostrar lista:::");
		List<Alumno> alumnosh = alumnoService.findAll();
		System.out.println(alumnosh.toString());
		return "listaAlumnos";
		
	}
}
