package com.aulasagendamentos.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulasagendamentos.entity.Agendamento;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento,Serializable>{
	

}
