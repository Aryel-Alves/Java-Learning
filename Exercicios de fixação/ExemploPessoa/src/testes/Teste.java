package testes;
import classes.Pessoa;

public class Teste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Joao";
		p1.idade = 42;
		p1.apresentar();
		p1.aniversariar();

	}

}
