package com.aulasagendamentos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aulasagendamentos.entity.Agendamento;
import com.aulasagendamentos.entity.Disponibilidad;
import com.aulasagendamentos.entity.Profesor;
import com.aulasagendamentos.repository.AgendamentoRepository;

@Service
public class AgendamentoServiceImplement implements AgendamentoService {
	
	@Autowired
	private  AgendamentoRepository agendamentoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Agendamento> findAll() {
		return agendamentoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Agendamento> findAll(Pageable pageable) {
		return agendamentoRepository.findAll(pageable);
	}

	@Override
	@Transactional
	public Optional<Agendamento> findById(Long id) {
		return agendamentoRepository.findById(id);
	}

	@Override
	@Transactional
	public Agendamento save(Agendamento agenda) {
		return agendamentoRepository.save(agenda);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		agendamentoRepository.deleteById(id);
	}
	
	@Override
	@Transactional
	public  List<Agendamento> listar(Long id){
		List<Agendamento> listar =  agendamentoRepository.listar(id);
		return listar;
	}


	@Override
	@Transactional	
	public Profesor profesor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Disponibilidad disponibilidad(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
