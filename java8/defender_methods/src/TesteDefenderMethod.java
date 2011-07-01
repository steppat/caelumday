import java.util.*;
import java.lang.reflect.*;

//	./bin/javac -d classes src/TesteDefenderMethod.java 
//	./bin/java -cp classes TesteDefenderMethod 

interface Filtro {
	boolean filter(int a);	
}

class DefaultFiltro implements Filtro {
	//cadê a implementacao
}

public class TesteDefenderMethod {

	public static boolean setFilter(Filtro filtro, int a) {
		System.out.println(filtro);
		return a %  2 == 0;
	}

	public static void main(String[] args) {
		System.out.println(new DefaultFiltro().filter(3));		
	}
}
