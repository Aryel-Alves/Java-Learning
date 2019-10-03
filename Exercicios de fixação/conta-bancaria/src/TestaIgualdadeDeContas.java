
public class TestaIgualdadeDeContas {
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.nomeTitular = "Duke";
		c1.deposita(227);
		
		Conta c2 = new Conta();
		c2.nomeTitular = "Duke";
		c2.deposita(227);
		
		// comparando ponteiros e logo são posições diferentes
		if(c1 == c2) { 
			System.out.println("contas iguais");
		}
		
		if(c1.equals(c2)) { // false
			System.out.println("contas iguais");
		}
		
		/*if(c1.compareTo(c2)>0) {
			System.out.println("contas iguais");
		}*/
	}
}
