package Proyect;

import java.util.Date;

public class Persona {

	private String NumeroIdentificacion;
	private String Nombre;
	private Date FechaNacimiento;
	private String CorreoElectronico;
	private String Genero;
	private String Contrasenia;
	private double amount;
	
	
	
	
	
	public double getAmount() {
		return amount;
	}





	public void setAmount(double amount) {
		this.amount = amount;
	}





	public String getNumeroIdentificacion() {
		return NumeroIdentificacion;
	}





	public void setNumeroIdentificacion(String numeroIdentificacion) {
		NumeroIdentificacion = numeroIdentificacion;
	}





	public String getNombre() {
		return Nombre;
	}





	public void setNombre(String nombre) {
		Nombre = nombre;
	}





	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}





	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}





	public String getCorreoElectronico() {
		return CorreoElectronico;
	}





	public void setCorreoElectronico(String correoElectronico) {
		CorreoElectronico = correoElectronico;
	}





	public String getGenero() {
		return Genero;
	}





	public void setGenero(String genero) {
		Genero = genero;
	}





	public String getContrasenia() {
		return Contrasenia;
	}





	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}





	public Persona(String numeroIdentificacion, String nombre, Date fechaNacimiento, String correoElectronico,
			String genero, String contrasenia) {
		super();
		NumeroIdentificacion = numeroIdentificacion;
		Nombre = nombre;
		FechaNacimiento = fechaNacimiento;
		CorreoElectronico = correoElectronico;
		Genero = genero;
		Contrasenia = contrasenia;
	}
	
	
}