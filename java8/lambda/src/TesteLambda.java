import java.util.*;
import java.lang.reflect.*;

//	./bin/javac -d classes src/TesteLambda.java
//	./bin/java -classpath classes TesteLambda

public class TesteLambda {

	public static void main(String[] args) {
		Runnable r = #{System.out.println("Caelum")};
		new Thread(#{System.out.println("Caelum")}).start();

		List<Pessoa> pessoas = Arrays.asList(new Pessoa(21), new Pessoa(20)) ;
		
		Comparator<Pessoa> comp = 
			#{ Pessoa pessoa, Pessoa outra -> 
				return pessoa.getIdade() - outra.getIdade();
			};
				
		Collections.sort(pessoas, comp);//no futuro pessoas.sortBy(comp);
		Collections.sort(pessoas, #{Pessoa p , Pessoa p2 -> p.getIdade() - p2.getIdade()});
		System.out.println(pessoas);
	}

}
class Pessoa{

	private int idade;

	Pessoa(int idade){
		this.idade = idade;
	} 

	int getIdade() {
		return this.idade;		
	}
	public String toString() {
		return String.valueOf(this.idade);
	}
}
