import java.util.*;;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//	./bin/javac -d classes src/TesteClosure.java
//	./bin/java -classpath classes TesteClosure

public class TesteClosure {

	public static void main(String[] args) {

		JButton button = new JButton("test");
		button.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent event){
				System.out.println("ftw");
			}
		});

		
		Comparator<Pessoa> comp = 
			#{ Pessoa pessoa, Pessoa outra -> 
				return pessoa.getIdade() - outra.getIdade();
			};


		List<Pessoa> pessoas = Arrays.asList(new Pessoa(21), new Pessoa(20)) ;				
		Collections.sort(pessoas, comp); //no futuro mais OO: pessoas.sortBy(comp);

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
