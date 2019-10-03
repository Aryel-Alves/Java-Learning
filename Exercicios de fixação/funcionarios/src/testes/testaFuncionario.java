package testes;
import classes.Funcionario;

public class testaFuncionario {

	public static void main(String[] args) {
		testaContrutorTodosOsParametros();
		testaContrutorUmParametro();
		testaContrutorSemParametro();
		
		System.out.println("Total funcionarios: " + Funcionario.getTotalEmployees());
	}
	
	public static void testaContrutorTodosOsParametros() {
		Funcionario pedro = new Funcionario("Pedro Ferreira","Financeiro",1000, "25/02/1998", "123456789");
		
		
		System.out.println("++++++++++Teste com todos parametros+++++++++++");
		pedro.reciveIncrease(50);
		System.out.println(pedro);
		pedro.show();
		System.out.println("++++++++++++++++++++++++++++++");
		pedro.setSalary(1500);
		pedro.setDepartament("RH");
		pedro.show();
	}
	
	public static void testaContrutorUmParametro() {
		Funcionario pedro = new Funcionario("João godofredo");
		
		System.out.println("++++++++++Teste com um parametro+++++++++++");
		pedro.reciveIncrease(50);
		pedro.show();
		System.out.println("++++++++++++++++++++++++++++++");
		pedro.setSalary(1500);
		pedro.setDepartament("RH");
		pedro.show();
	}
	
	public static void testaContrutorSemParametro() {
		Funcionario pedro = new Funcionario();
		
		System.out.println("++++++++++Teste sem parametro+++++++++++");
		pedro.reciveIncrease(50);
		pedro.show();
		System.out.println("++++++++++++++++++++++++++++++");
		pedro.setSalary(1500);
		pedro.setDepartament("RH");
		pedro.show();
	}
	
}
