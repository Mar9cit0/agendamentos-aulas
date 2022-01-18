package com.aulasagendamentos.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.aulasagendamentos.entity.Disponibilidad;

@Service
public interface DisponibilidadRepository  extends JpaRepository<Disponibilidad, Serializable> {
	@Query(value="SELECT * FROM horarios where id_profesor = :id and disponible = 1", nativeQuery = true)
	public List<Disponibilidad> data(Long id);
	
	@Query(value="SELECT * FROM horarios where id_profesor = :id and disponible = 1 and data=:data", nativeQuery = true)
	public List<Disponibilidad> horas(Long id, String data);
	
	

}
