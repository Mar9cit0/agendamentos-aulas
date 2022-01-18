package com.aulasagendamentos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aulasagendamentos.entity.Disponibilidad;
import com.aulasagendamentos.repository.DisponibilidadRepository;

@Service
public class DisponibilidadServiceImplement implements DisponibilidadService  {
	
	@Autowired
	private  DisponibilidadRepository disponibilidadRepository;
	
	
	@Override
	@Transactional
	public  List<Disponibilidad> data(Long id){
		List<Disponibilidad> datas =  disponibilidadRepository.data(id);
		return datas;

	}
	
	@Override
	@Transactional
	public  List<Disponibilidad> horas(Long id,String data){
		List<Disponibilidad> horas =  disponibilidadRepository.horas(id,data);
		return horas;

	}

}
