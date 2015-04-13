public class Funcionario {
	String nome;
	String departamento;
	double salario;
	Data dataEntrada;
	String rg;

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