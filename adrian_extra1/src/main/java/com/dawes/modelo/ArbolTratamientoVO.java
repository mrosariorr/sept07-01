package com.dawes.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class ArbolTratamientoVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="idarbol")
	private ArbolVO arbol;
	
	@ManyToOne
	@JoinColumn(name="idtratemiento")
	private TratamientoVO tratamiento;
	
	private Date fecha;

	public ArbolTratamientoVO() {
	}

	public ArbolTratamientoVO(int id, ArbolVO arbol, TratamientoVO tratamiento, Date fecha) {
		this.id = id;
		this.arbol = arbol;
		this.tratamiento = tratamiento;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArbolVO getArbol() {
		return arbol;
	}

	public void setArbol(ArbolVO arbol) {
		this.arbol = arbol;
	}

	public TratamientoVO getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(TratamientoVO tratamiento) {
		this.tratamiento = tratamiento;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arbol == null) ? 0 : arbol.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + id;
		result = prime * result + ((tratamiento == null) ? 0 : tratamiento.hashCode());
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
		ArbolTratamientoVO other = (ArbolTratamientoVO) obj;
		if (arbol == null) {
			if (other.arbol != null)
				return false;
		} else if (!arbol.equals(other.arbol))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id != other.id)
			return false;
		if (tratamiento == null) {
			if (other.tratamiento != null)
				return false;
		} else if (!tratamiento.equals(other.tratamiento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ArbolTratamientoVO [id=" + id + ", arbol=" + arbol + ", tratamiento=" + tratamiento + ", fecha=" + fecha
				+ "]";
	}
	
	
	
}
