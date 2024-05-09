package model;

public class Editorial {
	
	public String id, editorial;

	public Editorial()
	{
	}
	
	public Editorial(String id, String editorial)
	{
		this.id = id;
		this.editorial = editorial;
	}

	/* Getters/Setters */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
	
}
