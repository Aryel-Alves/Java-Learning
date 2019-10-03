import java.util.Scanner;

public class ExemploArrays {
	
	public static int maior (int[] a) {
		int maiorElemento = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=maiorElemento) {
				maiorElemento = a[i];
			}
		}
		return maiorElemento;
	}
	
	public static double mediaDoArray(int[] a) {
		
		if (a.length>0) {
			int somaDeTodosElementos = 0;
			for (int i = 0; i < a.length; i++) {
				somaDeTodosElementos += a[i];
			}

			return somaDeTodosElementos / a.length;
		}
		else
			return -1;
	}
	
	public static int[] somaArray(int[] a, int[] b) {
		int c[] = new int[5];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
		}
		
		return c;
	}
	
	public static void imprimirArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = {12, 45, 8, 78, 6};
		imprimirArray(a);
		double mediaDeA = mediaDoArray(a);
		System.out.println("Media de A:  " + mediaDeA);
	
	
		int b[] = new int[5];
		b[0] = 12;
		b[1] = 222;
		b[2] = 44;
		b[3] = 15;
		b[4] = 6;
		//imprimirArray(b);
		
		
		int c[] = new int[5];
		
		System.out.println("\nDigite 5 numeros: ");
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextInt();
		}
		
		
		System.out.println();
		//imprimirArray(c);
		double mediaDeC = mediaDoArray(c);
		System.out.println("Media de C:  " + mediaDeC);
	}
}
