package EstructuraTP.modelo;

public class Persona {
private String DNI;
private String nombreCom;
private String fechaNacimineto;
private SL situacionLaboral;
public  Persona(String DNI, String nombreCom, String fechaNacimineto, SL situacionLaboral) {  
	this.DNI = DNI;
	this.nombreCom = nombreCom;
	this.fechaNacimineto = fechaNacimineto;
	this.situacionLaboral = situacionLaboral;
	
}
public String getDNI() {
	return DNI;
}
public void setDNI(String dNI) {
	DNI = dNI;
}
public String getNombreCom() {
	return nombreCom;
}
public void setNombreCom(String nombreCom) {
	this.nombreCom = nombreCom;
}
public String getFechaNacimineto() {
	return fechaNacimineto;
}
public void setFechaNacimineto(String fechaNacimineto) {
	this.fechaNacimineto = fechaNacimineto;
}
public SL getSituacionLaboral() {
	return situacionLaboral;
}
public void setSituacionLaboral(SL situacionLaboral) {
	this.situacionLaboral = situacionLaboral;
}
}
