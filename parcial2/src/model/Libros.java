package model;

public class Libros {
			
	public String ISBN, titulo;
	public int año, ventastotal;
		
	public Libros() {
	}
	
	public Libros (String ISBN, String titulo, int año, int ventastotal)
	{
		this.año = año;
		this.ventastotal = ventastotal;
		this.ISBN = ISBN;
		this.titulo = titulo;
	}

	/* Getters/Setters */	

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getVentastotal() {
		return ventastotal;
	}

	public void setVentastotal(int ventastotal) {
		this.ventastotal = ventastotal;
	}
	
	
}
