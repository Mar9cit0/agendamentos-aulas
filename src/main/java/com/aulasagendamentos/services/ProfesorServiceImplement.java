package com.aulasagendamentos.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aulasagendamentos.entity.Profesor;
import com.aulasagendamentos.repository.ProfesorRepository;

@Service
public class ProfesorServiceImplement implements ProfesorService  {
	
	@Autowired
	private  ProfesorRepository  profesorRepository;
	
	
	@Override
	@Transactional
	public  List<Profesor> prof(Long id){
		List<Profesor> profs =  profesorRepository.prof(id);
		return profs;
	}

}
