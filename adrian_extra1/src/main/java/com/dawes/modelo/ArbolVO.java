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
@Table(name="arbol")
public class ArbolVO {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idarbol;
	
	private String identificacion;
	
	private String variedad;
	
	@OneToMany(mappedBy="arbol",cascade = CascadeType.REMOVE)
	List<ArbolTratamientoVO> tratamientos;
	
	
	public ArbolVO() {
		
	}


	public ArbolVO(int idarbol, String identificacion, String variedad, List<ArbolTratamientoVO> tratamientos) {
		this.idarbol = idarbol;
		this.identificacion = identificacion;
		this.variedad = variedad;
		this.tratamientos = tratamientos;
	}


	public int getIdarbol() {
		return idarbol;
	}


	public void setIdarbol(int idarbol) {
		this.idarbol = idarbol;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public String getVariedad() {
		return variedad;
	}


	public void setVariedad(String variedad) {
		this.variedad = variedad;
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
		result = prime * result + idarbol;
		result = prime * result + ((identificacion == null) ? 0 : identificacion.hashCode());
		result = prime * result + ((tratamientos == null) ? 0 : tratamientos.hashCode());
		result = prime * result + ((variedad == null) ? 0 : variedad.hashCode());
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
		ArbolVO other = (ArbolVO) obj;
		if (idarbol != other.idarbol)
			return false;
		if (identificacion == null) {
			if (other.identificacion != null)
				return false;
		} else if (!identificacion.equals(other.identificacion))
			return false;
		if (tratamientos == null) {
			if (other.tratamientos != null)
				return false;
		} else if (!tratamientos.equals(other.tratamientos))
			return false;
		if (variedad == null) {
			if (other.variedad != null)
				return false;
		} else if (!variedad.equals(other.variedad))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ArbolVO [idarbol=" + idarbol + ", identificacion=" + identificacion + ", variedad=" + variedad
				+ ", tratamientos=" + tratamientos + "]";
	}

	
	
}
