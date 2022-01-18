package com.aulasagendamentos.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulasagendamentos.entity.Agendamento;

import com.aulasagendamentos.services.AgendamentoService;


@CrossOrigin
@RestController
@RequestMapping("/api/")
public class AgendamentoController {
	
	@Autowired
    private AgendamentoService agendamentoService;
	
	@PostMapping("agendamento")
	public ResponseEntity<?> create (@RequestBody Agendamento agendamento) {
		return ResponseEntity.status(HttpStatus.CREATED).body(agendamentoService.save(agendamento));
	}

	@GetMapping("listar/{id}")
	public ResponseEntity<?> listar( @PathVariable(value = "id") Long userId ) {
		List<Agendamento> listar = agendamentoService.listar(userId);
		return ResponseEntity.status(HttpStatus.OK).body(listar);
		
	}
	
	@DeleteMapping("agendamento/{id}")
	public ResponseEntity<?> delete ( @PathVariable(value = "id") Long idAgenda ) {
		agendamentoService.deleteById(idAgenda);
		return null;
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<?> update (@RequestBody Agendamento agendamentoDetails, @PathVariable(value="id") Long idAgenda){
		
		Optional<Agendamento> oAgenda = agendamentoService.findById(idAgenda);
		
		if(!oAgenda.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.status(HttpStatus.CREATED).body(agendamentoService.save(agendamentoDetails));
	}
	

	

}
