package br.com.empresa.banco;
public class TesteFuncionario {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();
		
		Funcionario f = new Funcionario();
		f.setNome("Danilo");
		f.setSalario(1000 + 100 * 1);
		f.setDepartamento("RH");
		f.setRg("754864");
		f.setDataEntrada(new Data(01, 01, 2015));
		
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Danilo");
		f2.setSalario(1000 + 100 * 1);
		f2.setDepartamento("RH");
		f2.setRg("754864");
		f2.setDataEntrada(new Data(01, 01, 2015));
		
		
		Funcionario f3 = new Funcionario();
		f3.setNome("Danilo");
		f3.setSalario(1000 + 100 * 1);
		f3.setDepartamento("RH");
		f3.setRg("754864");
		f3.setDataEntrada(new Data(01, 01, 2015));
		
		empresa.adiciona(f);
		empresa.adiciona(f2);
		empresa.adiciona(f3);
		
		empresa.mostraEmpregados();
		System.out.println("\n\nQuantidade" + f3.identificador);
		
	
	}

}
