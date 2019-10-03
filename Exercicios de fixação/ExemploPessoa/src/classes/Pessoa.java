package classes;

public class Pessoa {
	// atributos
	public String nome;
	public int idade;
	
	// Métodos
	public void apresentar() {
		System.out.println("Olá, meu nome é" + nome + " tenho " + idade + " anos.");
	}
	public void aniversariar() {
		idade+=1;
	}

}
