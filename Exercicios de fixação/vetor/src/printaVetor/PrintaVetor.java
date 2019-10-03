package printaVetor;

import java.util.Scanner;

public class PrintaVetor {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] v = new int[10];
		
		System.out.println("*** Insira os dados do vetor ***");
		
		for(int i=0; i < v.length; i++) {
			v[i] = sc.nextInt();
		}
		
		System.out.println("tamanho: " + v.length);
		
		for (int i = v.length - 1 ; i > 0 ; i--) {
			System.out.println("Elementos: " + v[i]);
		}
		
	}

}
