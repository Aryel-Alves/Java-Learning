package n1_triangulo;

import java.util.Scanner;

public class VerificaSePodeFormarTriangulo {
	
	private static Scanner sc;
	
	public static void verifyPoints(double a, double b, double c) {
		if ((Math.abs(b-c) < a && a < (a + b)) && (Math.abs(a-c) < b && b < (a + c)) && (Math.abs(a-b) < c && c < (a + b))) {
			System.out.println("Pode formar um triangulo!");
		} else {
			System.out.println("Não forma um triangulo!");
		}
	}
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		double a = sc.nextDouble();
		System.out.println("Digite o segundo valor: ");
		double b = sc.nextDouble();
		System.out.println("Digite o terceiro valor: ");
		double c = sc.nextDouble();
		
		verifyPoints(a, b, c);
		
	}

}
