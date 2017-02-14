package Ejercicio1;

import java.util.ArrayList;
import java.util.List;



public class Modulo {
 private String nombre;
 private int horas;
 private Profesor[] ListadeProfesores;
 private List<Alumno> ListadeAlumnos;
 
 
public Modulo(String nombre, int horas)
{
	this.nombre= nombre;
	this.horas= horas;
	this.ListadeProfesores= new Profesor[2];
	this.ListadeAlumnos= new ArrayList<Alumno>();
	
}


public String getNombre() {
	return nombre;
}


public int getHoras() {
	return horas;
}


public Profesor[] getListadeProfesores() {
	return ListadeProfesores;
}



public List<Alumno> getListadeAlumnos() {
	return ListadeAlumnos;
}

public List<Alumno> AlumnosMenoresdeEdad(){
	List<Alumno> AlumnosMenores= new ArrayList<>();
	
	for (Alumno alu: ListadeAlumnos) {
		if (alu.getEdad() <18) {
			AlumnosMenores.add(alu);
		
		}
	}
	return AlumnosMenores;
}


public void setListadeProfesores(Profesor[] listadeProfesores) {
	ListadeProfesores = listadeProfesores;
}


public void setListadeAlumnos(List<Alumno> listadeAlumnos) {
	ListadeAlumnos = listadeAlumnos;
}


@Override
public String toString() {
	return "ALUMNOS: \n" + ListadeAlumnos + "\nPROFESORES: \n"+ ListadeProfesores+ 
			"\nNOMBRE DEL MODULO: \n"+ nombre+ "\nHORAS: "+ horas;
			
}


}
