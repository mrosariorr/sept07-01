package com.dawes.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dawes.DAOImp.ArbolDAOImp;
import com.dawes.DAOImp.ArbolTratamientoDAOImp;
import com.dawes.DAOImp.TratamientoDAOImp;
import com.dawes.modelo.ArbolTratamientoVO;
import com.dawes.modelo.ArbolVO;
import com.dawes.modelo.TratamientoVO;

public class MySqlDAOFactory {
	public static ArrayList<TratamientoVO> tratamientos;
	public static ArrayList<ArbolVO> arboles;
	public static ArrayList<ArbolTratamientoVO> relaciones;
	
	public static void main(String[] args) {
		
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        arboles = new ArrayList();
        arboles.add(new ArbolVO(1,"Abeto","Común", null));
        arboles.add(new ArbolVO(2,"Pino", "Canario",null));
        arboles.add(new ArbolVO(3,"Roble","Roble V", null));
        tratamientos = new ArrayList();
        tratamientos.add(new TratamientoVO(1,"Gasifiación", null));
        tratamientos.add(new TratamientoVO(2,"Regado", null));
        tratamientos.add(new TratamientoVO(3,"Poda", null));
        relaciones = new ArrayList();

        
        for (ArbolVO arbol: arboles) {
        	em.persist(arbol);
        }
        for (ArbolTratamientoVO relacion: relaciones) {
        	em.persist(relacion);
        }
        for (int i = 0; i < 2; i++) {
        	relaciones.add(new ArbolTratamientoVO(1,arboles.get(i),tratamientos.get(i), new GregorianCalendar(2022,1,i + 1).getTime()));
        }
        for (TratamientoVO tratamiento: tratamientos) {
        	em.persist(tratamiento);
        }
         
        em.getTransaction().commit();
         
		
	}
}
