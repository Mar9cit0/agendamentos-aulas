package com.aulasagendamentos.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aulasagendamentos.entity.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Serializable> {
	@Query(value="SELECT * FROM areas_conocimientos", nativeQuery = true)
	public List<Area> area();


}
