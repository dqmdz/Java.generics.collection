package ar.edu.um.programacion2.clase3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   	
    	List<Sumable> l = new ArrayList<Sumable>();
    	l.add(new Persona());
    	l.add(new Monitor());
    	
    	for (Sumable sumable : l) {
			sumable.increment();
			System.out.println(sumable.toString());
		}
    }
}
