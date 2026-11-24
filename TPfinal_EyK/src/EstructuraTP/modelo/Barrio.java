package EstructuraTP.modelo;

public abstract class Barrio {
private String nombre;
private double superficie;
public Barrio(String nombre, double superficie) {
	this.nombre= nombre;
	this.superficie = superficie;
}

public abstract double densidadPoblacional();
public abstract boolean criticidadHabitacional();

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getSuperficie() {
	return superficie;
}
public void setSuperficie(float superficie) {
	this.superficie = superficie;
}
}
