public class Funcionario {
	
	public static int identificador;
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;
	
	public Funcionario() {
		identificador += 1;
	}

	public Funcionario(String nome) {
		identificador += 1;
		this.nome = nome;
	}
	
	public static int getIdentificador() {
		return identificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	void aumentaSalario(double fator) {
		this.salario += fator;
	}

	double ganhoAnual() {
		double ganhoAnual = this.salario * 12;
		return ganhoAnual;
	}

	public void mostra() {
		System.out.printf("%-17s%s\n%-17s%s\n%-17s%f\n%-17s%s\n%-17s%s",
				"Nome: ",nome,"Departamento: ",departamento,"Salario: ",salario,
				"Data de Entrada: ",dataEntrada.getFormatada(),"RG: ",rg);		
	}
}