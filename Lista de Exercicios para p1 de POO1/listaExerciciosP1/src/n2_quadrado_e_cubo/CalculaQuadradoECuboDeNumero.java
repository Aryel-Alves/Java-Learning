package n2_quadrado_e_cubo;

import java.util.Scanner;

public class CalculaQuadradoECuboDeNumero {
	private static Scanner SC;
	
	public static void printNumbers(int n) {
		System.out.println("Numero  | Quadrado | Cubo ");
		for (int i=1; i<=n; i++) {
			int square = i*i;
			int cube = i*i*i;
			System.out.printf("%d    | %d     | %d   \n", i, square, cube);
		}
	}
	
	public static void main(String[] args) {
		
		SC = new Scanner(System.in);
		System.out.println("Digite o numero: ");
		int n = SC.nextInt();
		printNumbers(n);
		
	}

}
