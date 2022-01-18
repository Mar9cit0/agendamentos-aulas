package com.aulasagendamentos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulasagendamentos.entity.Profesor;
import com.aulasagendamentos.services.ProfesorService;

@CrossOrigin
@RestController
@RequestMapping("/api/")
public class ProfesorController {
	@Autowired
	private ProfesorService profesorService;

	@GetMapping("prof/{id}")
	public ResponseEntity<?> prof(@PathVariable(value = "id") Long areaId) {
		List<Profesor> profesores = profesorService.prof(areaId);

		return ResponseEntity.status(HttpStatus.OK).body(profesores);
	}

}
