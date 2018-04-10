package ar.edu.um.programacion2.clase3.collections;

public class Monitor implements Sumable {
	private int pulgadas;

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public String toString() {
		return "Monitor [pulgadas=" + pulgadas + "]";
	}

	public void increment() {
		// TODO Auto-generated method stub
		pulgadas+=15;
	}
	
	
}
