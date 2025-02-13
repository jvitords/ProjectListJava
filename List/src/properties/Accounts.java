package properties;

public class Accounts {
	
	private String nome;
	private Integer id;
	private Double salario;
	
	public Accounts(String nome, Integer id,Double salario) {
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}
	
	public Double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public Integer getId() {
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double aumentoDeSalario(double valorDaPorcentagem) {
		double porcentagem = valorDaPorcentagem / 100;
		double valorDoAumento = salario * porcentagem;
		System.out.println("\nAumento de R$" + valorDoAumento + " registrado com sucesso!\n");
		this.salario = this.salario + (this.salario * porcentagem);
		return this.salario;
	}

	public String toString() {
		return "Nome do titular: " + nome
				+ "\nId da conta: " + id
				+ "\nSalário: R$" + salario;
	}
}
