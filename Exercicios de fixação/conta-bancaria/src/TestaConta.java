
public class TestaConta {

	public static void main(String[] args) {
		//criando a conta
		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.nomeTitular = "Aryel";
		minhaConta.printaSaldo();

		//saca 200 reais
		/*minhaConta.saca(200);
		System.out.println("Saldo: " + minhaConta.saldo); */
		
		boolean consegui = minhaConta.saca(2000);
		if(consegui) {
			System.out.println("Saque efetuado");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		// deposita 500 reais
		minhaConta.deposita(500);
		minhaConta.printaSaldo();
		
		Conta contaDoProf = new Conta();
		contaDoProf.nomeTitular = "Giomar";
		
		minhaConta.transfere(contaDoProf, 300);
		
		
	}

}
