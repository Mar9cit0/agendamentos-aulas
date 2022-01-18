package com.aulasagendamentos.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aulasagendamentos.entity.Profesor;


@Repository
public interface ProfesorRepository extends JpaRepository<Profesor,Serializable> {
	@Query(value="SELECT * FROM profesores where area_id = :id", nativeQuery = true)
	public List<Profesor> prof(Long id);

}
