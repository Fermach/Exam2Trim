package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//importa las bibliotecas que creas necesaria.
public class Curso{
	
public static void main(String[] args) {
	
  Alumno alumno1 = new Alumno("joaquinto", "pocas luces", 13);
  Alumno alumno2 = new Alumno("alvaro", "elistillo de clase", 15);
  Alumno alumno3 = new Alumno("antonio", "pedante sabelotodo", 43);
  Alumno alumno4 = new Alumno("beatriz", "aprueba todo", 23);
  Alumno alumno5 = new Alumno("carmen", "brillante brillante", 17);
  Profesor profesor1 = new Profesor("augusto", "mecargotodo", true);
  Profesor profesor2 = new Profesor("pedrito", "machacan", false);

 
 
  
 
 
  
  //lee desde la clase scanner el nombre del módulo
 //y las horas del mismo, dichas horas deben estar comprendidas entre
  System.out.println(" Introduce el nombre del modulo y las horas (3-8): ");
  Scanner sc = new Scanner(System.in);
  String nombre= sc.next();
  int horas= sc.nextInt();
  
//igual con el  nombre del módulo, deben ser solo letras
//usa una expresión regular para controlar el dato introducido
//tanto para que sea un entero y esté en ese rango de valor
  if(nombre.matches("[a-zA-Z]+") && (""+horas).matches("[0-9]")){
    if(horas>3 && horas<8){
	  //crea un objeto de tipo modulo
	  Modulo m = new Modulo(nombre, horas);
	  
	  //a�ade los alumnos y los profesores
	  List<Alumno> ListadeAlumnos= new ArrayList<>();
	  ListadeAlumnos.add(alumno1);
	  ListadeAlumnos.add(alumno2);
	  ListadeAlumnos.add(alumno3);
	  ListadeAlumnos.add(alumno4);
	  ListadeAlumnos.add(alumno5);
	  m.setListadeAlumnos(ListadeAlumnos);
	  
	  
	 
	  
	  m.getListadeProfesores(profesor1, profesor2);//no recuerdo como se a�adian 
	  
      System.out.println(m);
      System.out.println(m.getListadeAlumnos());
      System.out.println(m.AlumnosMenoresdeEdad());
      System.out.println(m.getListadeProfesores());

  }else{
	  System.out.println("Los valores introducidos no son validos ");

	  Modulo m = new Modulo("DEFAULT",6 );
      System.out.println(m);
  }
  }
  
  
  
 
  //NO puede lanzarse una excepción por introducir un valor no entero
  //en el caso que la cantidad introducida no corresponda al rango anterior
  //o no sea una cadena de letras el nombre del módulo
  //se establecerá 6 horas en caso de una lectura errónea
  //y DEFAULT como nombre del ciclo  en caso incorrecto 

  //imprime la referencia del módulo
  //imprime la lista de alumnos
  //imprime la lista alumnes menores de edad
  //imprime la lista de profesores

}

private static void setListadeProfesores(Profesor profesor1, Profesor profesor2) {
	// TODO Auto-generated method stub
	
}

private static void setListadeAlumnos(List<Alumno> listadeAlumnos) {
	// TODO Auto-generated method stub
	
}
}
