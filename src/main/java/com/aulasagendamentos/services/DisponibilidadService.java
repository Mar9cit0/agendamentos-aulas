package com.aulasagendamentos.services;

import java.util.List;

import com.aulasagendamentos.entity.Disponibilidad;

public interface DisponibilidadService {

	List<Disponibilidad> data(Long profId);

	List<Disponibilidad> horas(Long id, String data);

}
