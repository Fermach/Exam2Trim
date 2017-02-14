package Ejercicio1;

public class Alumno {
 private String nombre;
 private String apellidos;
 private int edad;
 
 public Alumno(String nombre,String apellido,int edad ){
	 
	 this.nombre= nombre;
	 this.apellidos=apellido;
	 this.edad=edad;
	 
 }

public String getNombre() {
	return nombre;
}


public String getApellidos() {
	return apellidos;
}

public int getEdad() {
	return edad;
}


@Override
public String toString() {
	return "APELLIDOs: " + apellidos + ":::NOMBRE: " + nombre + ":::EDAD: " + edad ;
}
	
}
