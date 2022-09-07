package com.dawes.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tratamiento")
public class TratamientoVO {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idtratemiento;
	
	private String denominacion;
	
	
	@OneToMany(mappedBy="tratamiento")
	List<ArbolTratamientoVO> tratamientos;


	public TratamientoVO() {

	}


	
	public TratamientoVO(int idtratemiento, String denominacion, List<ArbolTratamientoVO> tratamientos) {
		this.idtratemiento = idtratemiento;
		this.denominacion = denominacion;
		this.tratamientos = tratamientos;
	}



	public int getIdtratemiento() {
		return idtratemiento;
	}


	public void setIdtratemiento(int idtratemiento) {
		this.idtratemiento = idtratemiento;
	}


	public String getDenominacion() {
		return denominacion;
	}


	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}


	public List<ArbolTratamientoVO> getTratamientos() {
		return tratamientos;
	}


	public void setTratamientos(List<ArbolTratamientoVO> tratamientos) {
		this.tratamientos = tratamientos;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((denominacion == null) ? 0 : denominacion.hashCode());
		result = prime * result + idtratemiento;
		result = prime * result + ((tratamientos == null) ? 0 : tratamientos.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TratamientoVO other = (TratamientoVO) obj;
		if (denominacion == null) {
			if (other.denominacion != null)
				return false;
		} else if (!denominacion.equals(other.denominacion))
			return false;
		if (idtratemiento != other.idtratemiento)
			return false;
		if (tratamientos == null) {
			if (other.tratamientos != null)
				return false;
		} else if (!tratamientos.equals(other.tratamientos))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "TratamientoVO [idtratemiento=" + idtratemiento + ", denominacion=" + denominacion + ", tratamientos="
				+ tratamientos + "]";
	}

	
	
}