package com.aulasagendamentos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulasagendamentos.entity.Area;
import com.aulasagendamentos.services.AreaService;

@CrossOrigin
@RestController
@RequestMapping("/api/")
public class AreaController {
	
	@Autowired
	private AreaService areaService;

	@GetMapping("areas")
	public ResponseEntity<?> areas() {
		System.out.print( "PASEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
		List<Area> areas = areaService.area();
		return ResponseEntity.status(HttpStatus.OK).body(areas);
		
	}
	

}
