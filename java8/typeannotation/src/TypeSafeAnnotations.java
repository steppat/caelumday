import checkers.nullness.quals.*;
import java.util.*;

class TypeAnnotations {

//java -Xbootclasspath/p:$JSR308/checker-framework/checkers/binary/jsr308-all.jar -jar $JSR308/checker-framework/checkers/binary/jsr308-all.jar -version

	public static void main(String ... args) {

		String retorno = example();

	}

 	public static @NonNull String example() {

	    List</*@NonNull*/ String> foo = new LinkedList</*@NonNull*/ String>();
	    List</*@NonNull*/ String> bar = foo;

	    @NonNull String quux = "quux";
	    foo.add(quux);
	    foo.add("quux");
	    @NonNull String baz = foo.get(0);
	    return baz;

  	}
}
