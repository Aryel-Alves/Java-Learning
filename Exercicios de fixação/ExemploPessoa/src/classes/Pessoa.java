package classes;

public class Pessoa {
	// atributos
	public String nome;
	public int idade;
	
	// M�todos
	public void apresentar() {
		System.out.println("Ol�, meu nome �" + nome + " tenho " + idade + " anos.");
	}
	public void aniversariar() {
		idade+=1;
	}

}
