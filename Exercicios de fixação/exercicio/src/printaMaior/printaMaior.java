package printaMaior;
import java.util.*;

public class printaMaior {

	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		System.out.println("Digite outro numero: ");
		int n2 = sc.nextInt();
		
		if (n1>n2) {
			System.out.println(n1);
		}
		else {
			System.out.println(n2);
		}
		
	}

}
