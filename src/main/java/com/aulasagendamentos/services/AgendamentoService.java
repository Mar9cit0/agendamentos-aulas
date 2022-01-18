package com.aulasagendamentos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.aulasagendamentos.entity.Agendamento;
import com.aulasagendamentos.entity.Disponibilidad;
import com.aulasagendamentos.entity.Profesor;

public interface AgendamentoService {
	
	public Iterable<Agendamento> findAll();
	public Page<Agendamento> findAll(Pageable pageable);
	public Optional<Agendamento> findById(Long id);
	public Agendamento save(Agendamento agenda);
	public void deleteById(Long id);
	public Profesor profesor();
	public Disponibilidad disponibilidad(Long id );
	List<Agendamento> listar(Long id);

}
