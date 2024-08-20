package ups.poo.mvc;

public class Estudiante {
	private String nombre;
    private int parcial1;
    private int parcial2;
    
	public Estudiante(String nombre, int parcial1, int parcial2) {
		super();
		this.nombre = nombre;
		this.parcial1 = parcial1;
		this.parcial2 = parcial2;
	}

	public String getNombre() {
		return nombre;
	}

	public int getParcial1() {
		return parcial1;
	}

	public void setParcial1(int parcial1) {
		this.parcial1 = parcial1;
	}

	public int getParcial2() {
		return parcial2;
	}

	public void setParcial2(int parcial2) {
		this.parcial2 = parcial2;
	}
    
	public int total() {
		return this.parcial1 + this.parcial2;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nParcial 1: " + parcial1 + "\nParcial 2: " + parcial2 + "\nTotal:\t"
				+ total() + "\n------------------------";
	} 
}