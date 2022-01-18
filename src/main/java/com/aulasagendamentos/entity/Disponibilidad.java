package com.aulasagendamentos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "horarios")
public class Disponibilidad implements Serializable {
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_profesor() {
		return id_profesor;
	}
	public void setId_profesor(Long id_profesor) {
		this.id_profesor = id_profesor;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String getHora() {
		return Hora;
	}
	public void setHora(String hora) {
		Hora = hora;
	}

	public Boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	private static final long serialVersionUID = -2416262376386753164L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private Long id_profesor;
	@Column(nullable=false)
	private String data;
	private String Hora;
	private Boolean disponible;
	
	

}
