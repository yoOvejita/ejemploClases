package principal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import clases.*;
import granja.*;

public class MiClasePrincipal {
	public static void main(String[] args) {
		Persona p = new Persona();
		p.setNombre("Pepe");
		p.setEdad(-10);
		p.caminar();
		
		Persona persona = new Persona("Sofia","Loza",30);
		
		Estudiante e = new Estudiante();
		e.setNombre("Ana");
		e.setApellido("Paredes");
		e.setEdad(20);
		e.setMatricula(123);
		e.caminar();
		
		System.out.println("Apellido: " + p.getApellido());
		System.out.println("Apellido: " + persona.getApellido());
		System.out.println("Apellido: " + e.getApellido());
		
		//¿Puedo crear un estudiante usando el constructor de persona?
		//Estudiante e2 = (Estudiante) new Persona("Raul","Rocha",20);
		//System.out.println("Apellido: " + e2.getApellido());
		// No es posible
		
		Persona per = e;
		per.caminar();
		System.out.println("Apellido: " + per.getApellido());
		
		SerHumano sh = new Estudiante();
		sh.hablar();
		((Estudiante)sh).caminar();
		
		Thread miHilo = new Thread(e);
		miHilo.start();
		
		/*
		 * Hablando sobre polimorfismo un poco a fondo
		 */
		
		Perro pe = new Perro();

		
		Cerdo c = new Cerdo();


		
		
		List<Animal> animalitos = new LinkedList<>();
		animalitos.add(pe);
		animalitos.add(c);
		
		for(Animal aa : animalitos)
			aa.sonidoAnimal();
		
		Set<Animal> conjunto = new HashSet();
		
		conjunto.add(c);
		conjunto.add(pe);
		
		for(Iterator iter = conjunto.iterator(); iter.hasNext();) {
			Animal bb = (Animal) iter.next();
			bb.sonidoAnimal();
		}
		/**
		 *  
		 *  Map, Set, SortedMap, SortedSet, List, Array
		 *  Clases abstractas
		 *  Manejo de Stream (ojo, no lo confundas con IO Streams)
		 * 
		 */
	}

}
