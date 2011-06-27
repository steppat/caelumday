import java.util.*;
import java.lang.reflect.*;

//	./bin/javac -d classes src/TesteExtensionMethod.java 
//	./bin/java -cp src TesteExtensionMethod ????

interface Filtro {
	boolean filter(int a) default TesteExtensionMethod.setFilter;	
}

class DefaultFiltro implements Filtro {
	//cadê a implementacao
}

public class TesteExtensionMethod {

	public static boolean setFilter(Filtro filtro, int a) {
		System.out.println(filtro);
		return a %  2 == 0;
	}

	public static void main(String[] args) {
		System.out.println(new DefaultFiltro().filter(3));		
	}
}
