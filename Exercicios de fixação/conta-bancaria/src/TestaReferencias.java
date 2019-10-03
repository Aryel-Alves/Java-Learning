
public class TestaReferencias {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.deposita(100);
		
		Conta c2 = c1; // ponteiro apontando ao mesmo bloco de memoria
		c2.deposita(200);
		
		c1.printaSaldo();
		c2.printaSaldo();
	}

}
