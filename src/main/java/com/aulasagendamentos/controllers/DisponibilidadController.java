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

import com.aulasagendamentos.entity.Disponibilidad;
import com.aulasagendamentos.services.DisponibilidadService;

@CrossOrigin
@RestController
@RequestMapping("/api/")
public class DisponibilidadController {
	@Autowired
	private DisponibilidadService disponibilidadService;

	@GetMapping("data/{id}")
	public ResponseEntity<?> data(@PathVariable(value = "id") Long profId) {
		List<Disponibilidad> datas = disponibilidadService.data(profId);

		return ResponseEntity.status(HttpStatus.OK).body(datas);
	}
	
	@GetMapping("hora/{id}/{data}")
	public ResponseEntity<?> data(@PathVariable(value = "id") Long profId, @PathVariable(value = "data") String profData) {
		List<Disponibilidad> horas = disponibilidadService.horas(profId,profData);

		return ResponseEntity.status(HttpStatus.OK).body(horas);
	}

}
