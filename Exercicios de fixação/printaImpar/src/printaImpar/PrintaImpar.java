package printaImpar;

import java.util.Scanner;

public class PrintaImpar {
	
	public static void main(String[] args) {
		System.out.println("*** PRINTAR PRIMEIROS 5 IMPARES ***");
		System.out.println("Digite um numero: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		for(int i=0; i>=numero; i++) {
			
			
			
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
}
