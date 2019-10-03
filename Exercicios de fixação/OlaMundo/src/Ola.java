import java.util.*;

public class Ola {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("OLA MUNDO EM JAVA - " + d.toString() + "\n");
		
		
		System.out.println("Digite seu nome: ");
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		System.out.println(nome + " é zika");
		
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("toma");
			if(i==5) {
				System.out.println("caralho");
			}
		}
		
	}

}
