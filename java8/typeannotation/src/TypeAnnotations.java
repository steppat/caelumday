import checkers.nullness.quals.*;
import java.util.*;

//http://types.cs.washington.edu/jsr308/specification/java-annotation-design.html

//para compilar, javac do checker-framework/checkers
//./bin/javac -processor checkers.nullness.NullnessChecker src/TypeAnnotations.java -d classes

//para executar como java
//java TypeAnnotations
public class TypeAnnotations {

	public static void main(String ... args) {

	    @NonNull String valor = "null"; //compile error
	    @NonNull String outro = "Tambem nao nulo";

	    List<@NonNull ?> g; //ok
	    List<@NonNull String> lista = new LinkedList<@NonNull String>();
	    lista.add(valor);
	    lista.add(outro);
	    lista.add("null"); //compile error

	    @NonNull String segundo = lista.get(1);
  	}
}

