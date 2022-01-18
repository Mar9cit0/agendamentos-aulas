package com.aulasagendamentos.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aulasagendamentos.entity.Agendamento;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento,Serializable>{
	@Query(value="SELECT * FROM agendamentos where id_user = :id", nativeQuery = true)
	List<Agendamento> listar(Long id);

}
