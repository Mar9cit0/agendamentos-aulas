package com.aulasagendamentos.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "agendamentos")
public class Agendamento implements Serializable {

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_user() {
		return id_user;
	}
	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}
	public Long getId_professor() {
		return id_professor;
	}
	public void setId_professor(Long id_professor) {
		this.id_professor = id_professor;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getName_profesor() {
		return name_profesor;
	}
	public void setName_profesor(String name_profesor) {
		this.name_profesor = name_profesor;
	}
	public String getName_area() {
		return name_area;
	}
	public void setName_area(String name_area) {
		this.name_area = name_area;
	}
	
	
	private static final long serialVersionUID = 6446007362924177580L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long id_user;
	private Long id_professor;
	private String hour;
	private Date date;	
	private String name_profesor;
	private String name_area;


	

}
