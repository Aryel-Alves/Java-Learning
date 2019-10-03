package n4_Elevator;

public class TestaElevador {

	public static void main(String[] args) {
		Elevador elevador1 = new Elevador(10,20);
		
		System.out.println(elevador1.toString());
		elevador1.entra();
		elevador1.entra();
		elevador1.sobe();
		System.out.println(elevador1.toString());
		elevador1.desce();
		elevador1.desce();

	}

}
