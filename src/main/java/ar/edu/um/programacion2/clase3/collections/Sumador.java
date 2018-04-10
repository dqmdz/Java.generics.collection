package ar.edu.um.programacion2.clase3.collections;

public class Sumador<T extends Sumable> {
	public void incrementar(T value) {
		value.increment();
	}
}
