
public class Conta {
	//atributos
	int numero;
	String nomeTitular;
	private double saldo;
	
	//métodos
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	/*void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}*/
	
	boolean saca(double valor) {
		if(this.saldo<valor) {
			return false;
		}
		else {
			System.out.println("Saque de " + valor + "efetuado com sucesso!");
			this.saldo = saldo - valor;
			return true;
		}
	}	
	
	void printaSaldo() {
		System.out.println("Saldo de " + this.nomeTitular + ": " + this.saldo);
	}
	
	/*void transfere(Conta destino, double valor) {
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}*/
	
	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if(!retirou) {
			System.out.println("Saldo insuficiente!");
			return false;
		} else {
			System.out.println("Transferido " + valor + " de " + this.nomeTitular + " para " + destino.nomeTitular);
			destino.deposita(valor);
			return true;
		}
	}
}
