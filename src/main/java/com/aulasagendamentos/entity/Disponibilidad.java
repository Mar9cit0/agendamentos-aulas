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
	public Boolean getHour00AM() {
		return Hour00AM;
	}
	public void setHour00AM(Boolean hour00am) {
		Hour00AM = hour00am;
	}
	public Boolean getHour01AM() {
		return Hour01AM;
	}
	public void setHour01AM(Boolean hour01am) {
		Hour01AM = hour01am;
	}
	public Boolean getHour02AM() {
		return Hour02AM;
	}
	public void setHour02AM(Boolean hour02am) {
		Hour02AM = hour02am;
	}
	public Boolean getHour03AM() {
		return Hour03AM;
	}
	public void setHour03AM(Boolean hour03am) {
		Hour03AM = hour03am;
	}
	public Boolean getHour04AM() {
		return Hour04AM;
	}
	public void setHour04AM(Boolean hour04am) {
		Hour04AM = hour04am;
	}
	public Boolean getHour05AM() {
		return Hour05AM;
	}
	public void setHour05AM(Boolean hour05am) {
		Hour05AM = hour05am;
	}
	public Boolean getHour06AM() {
		return Hour06AM;
	}
	public void setHour06AM(Boolean hour06am) {
		Hour06AM = hour06am;
	}
	public Boolean getHour07AM() {
		return Hour07AM;
	}
	public void setHour07AM(Boolean hour07am) {
		Hour07AM = hour07am;
	}
	public Boolean getHour08AM() {
		return Hour08AM;
	}
	public void setHour08AM(Boolean hour08am) {
		Hour08AM = hour08am;
	}
	public Boolean getHour09AM() {
		return Hour09AM;
	}
	public void setHour09AM(Boolean hour09am) {
		Hour09AM = hour09am;
	}
	public Boolean getHour10AM() {
		return Hour10AM;
	}
	public void setHour10AM(Boolean hour10am) {
		Hour10AM = hour10am;
	}
	public Boolean getHour11AM() {
		return Hour11AM;
	}
	public void setHour11AM(Boolean hour11am) {
		Hour11AM = hour11am;
	}
	public Boolean getHour12PM() {
		return Hour12PM;
	}
	public void setHour12PM(Boolean hour12pm) {
		Hour12PM = hour12pm;
	}
	public Boolean getHour13PM() {
		return Hour13PM;
	}
	public void setHour13PM(Boolean hour13pm) {
		Hour13PM = hour13pm;
	}
	public Boolean getHour14PM() {
		return Hour14PM;
	}
	public void setHour14PM(Boolean hour14pm) {
		Hour14PM = hour14pm;
	}
	public Boolean getHour15PM() {
		return Hour15PM;
	}
	public void setHour15PM(Boolean hour15pm) {
		Hour15PM = hour15pm;
	}
	public Boolean getHour16PM() {
		return Hour16PM;
	}
	public void setHour16PM(Boolean hour16pm) {
		Hour16PM = hour16pm;
	}
	public Boolean getHour17AM() {
		return Hour17AM;
	}
	public void setHour17AM(Boolean hour17am) {
		Hour17AM = hour17am;
	}
	public Boolean getHour18PM() {
		return Hour18PM;
	}
	public void setHour18PM(Boolean hour18pm) {
		Hour18PM = hour18pm;
	}
	public Boolean getHour19PM() {
		return Hour19PM;
	}
	public void setHour19PM(Boolean hour19pm) {
		Hour19PM = hour19pm;
	}
	public Boolean getHour20PM() {
		return Hour20PM;
	}
	public void setHour20PM(Boolean hour20pm) {
		Hour20PM = hour20pm;
	}
	public Boolean getHour21PM() {
		return Hour21PM;
	}
	public void setHour21PM(Boolean hour21pm) {
		Hour21PM = hour21pm;
	}
	public Boolean getHour22PM() {
		return Hour22PM;
	}
	public void setHour22PM(Boolean hour22pm) {
		Hour22PM = hour22pm;
	}
	public Boolean getHour23PM() {
		return Hour23PM;
	}
	public void setHour23PM(Boolean hour23pm) {
		Hour23PM = hour23pm;
	}
	private static final long serialVersionUID = -2416262376386753164L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private Long id_profesor;
	@Column(nullable=false)
	private String data;
	private Boolean Hour00AM;
	private Boolean Hour01AM;
	private Boolean Hour02AM;
	private Boolean Hour03AM;
	private Boolean Hour04AM;
	private Boolean Hour05AM;
	private Boolean Hour06AM;
	private Boolean Hour07AM;
	private Boolean Hour08AM;
	private Boolean Hour09AM;
	private Boolean Hour10AM;
	private Boolean Hour11AM;
	private Boolean Hour12PM;
	private Boolean Hour13PM;
	private Boolean Hour14PM;
	private Boolean Hour15PM;
	private Boolean Hour16PM;
	private Boolean Hour17AM;
	private Boolean Hour18PM;
	private Boolean Hour19PM;
	private Boolean Hour20PM;
	private Boolean Hour21PM;
	private Boolean Hour22PM;
	private Boolean Hour23PM;	
	
	
	

}
