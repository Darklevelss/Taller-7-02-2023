package co.edu.uptc.logica.modelo;

import java.time.LocalDate;

public class Premio {
private short id;
private String nombre;
private LocalDate fechaObt;
public short getId() {
	return id;
}
public void setId(short id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public LocalDate getFechaObt() {
	return fechaObt;
}
public void setFechaObt(LocalDate fechaObt) {
	this.fechaObt = fechaObt;
}

}
