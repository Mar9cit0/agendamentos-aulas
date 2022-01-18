package com.aulasagendamentos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aulasagendamentos.entity.Area;
import com.aulasagendamentos.repository.AreaRepository;

@Service
public class AreaServiceImplement  implements AreaService {

	@Autowired
	private  AreaRepository areaRepository;
	
	@Override
	@Transactional
	public  List<Area> area() {
		List<Area> areas =  areaRepository.area();;
		return areas;

	}

}
