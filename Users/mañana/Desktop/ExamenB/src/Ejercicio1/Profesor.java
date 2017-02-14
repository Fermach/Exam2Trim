package Ejercicio1;

public class Profesor {

	 private String nombre;
	 private String Primer_apellido;
	 private boolean definitivo;
	 
	 public Profesor(String nombre,String apellido,boolean definitivo ){
		 
		 this.nombre= nombre;
		 this.Primer_apellido=apellido;
		 this.definitivo=definitivo;
		 
	 }

	
	public String getNombre() {
		return nombre;
	}


	public String getPrimer_apellido() {
		return Primer_apellido;
	}


	public boolean isDefinitivo() {
		return definitivo;
	}


	@Override
	public String toString() {
		return "APELLIDOs: " + Primer_apellido + ":::NOMBRE: " + nombre + ":::DEFINITIVO: " + definitivo ;
	}
		
	}


