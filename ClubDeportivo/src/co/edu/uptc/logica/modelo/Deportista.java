package co.edu.uptc.logica.modelo;

import java.time.LocalDate;
import java.util.ArrayList;


public class Deportista {
	//atributos deportista
private Disciplina queHace;
private ArrayList<Premio> premiosGanados;
private String nombre;
private LocalDate fechaNac;
private String lugarNacimiento;
//metodos 
public Disciplina getQueHace() {
	return queHace;
}
public void setQueHace(Disciplina queHace) {
	this.queHace = queHace;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public LocalDate getFechaNac() {
	return fechaNac;
}
public void setFechaNac(LocalDate fechaNac) {
	
	this.fechaNac = fechaNac;
}
public String getLugarNacimiento() {
	return lugarNacimiento;
}
public void setLugarNacimiento(String lugarNacimiento) {
	this.lugarNacimiento = lugarNacimiento;
}
}
