package model;

public class Autores {
	
	public  String id, nombre, pais;
	
	public Autores()
	{
	}
	
	public Autores(String id, String nombre, String pais)
	{
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
	}
	
	/* Getters/Setters */	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
