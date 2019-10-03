package classes;

public class Funcionario {
	
	private String name;
	private String entryDate;
	private double salary;
	private String departament;
	private String registerCode;
	
	private static int totalEmployees;
	
	/** Constructor of the class */
	public Funcionario() {
		Funcionario.totalEmployees++;
		this.name = "";
		this.departament = "";
		this.salary = Utils.MIN_SALARY;
		this.entryDate = "00/00/00";
		this.registerCode = "0000000000";
	}
	
	public Funcionario(String nome) {
		Funcionario.totalEmployees++;
		this.name = nome;
	}
	
	public Funcionario(String nome, String departament , double salary, String entryDate, String registerCode) {
		Funcionario.totalEmployees++;
		this.name = nome;
		this.departament = departament;
		this.salary = salary;
		this.entryDate = entryDate;
		this.registerCode = registerCode;
	}
	//end of constructor
	
	//gets and setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartament() {
		return this.departament;
	}
	
	public void setDepartament(String departament) {
		this.departament = departament;
	}
	
	public String getEntryDate() {
		return this.entryDate;
	}
	
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRegisterCode() {
		return registerCode;
	}

	public void setRegisterCode(String registerCode) {
		this.registerCode = registerCode;
	}
	
	// metodo estatico que pode ser chamado sem instaciar a classe
	public static int getTotalEmployees() {
		return Funcionario.totalEmployees;
	}

	// methods
	public void reciveIncrease(double increase) {
		this.salary += increase;
	}
	
	public double annualGain() {
		return this.salary * 12;
	}
	
	@Override
	public String toString() {
		return "Funcionario [name=" + name + ", salary=" + salary + ", departament=" + departament + "]";
	}

	public void show() {
		System.out.println("Name : " + this.name);
		System.out.println("Departament : " + this.departament);
		System.out.println("Salary : " + this.salary);
		System.out.println("Annual Gain : " + this.annualGain());
		System.out.println("Entry Date : " + this.entryDate);
		System.out.println("RegisterCode : " + this.registerCode);
	}
}
