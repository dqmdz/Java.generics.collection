package ar.edu.um.programacion2.clase3.collections;

public class Persona implements Sumable {
	@Override
	public String toString() {
		return "Persona [edad=" + edad + "]";
	}

	private int edad;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void increment() {
		// TODO Auto-generated method stub
		edad++;
	}
	
	
}
