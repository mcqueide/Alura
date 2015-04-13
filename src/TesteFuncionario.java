public class TesteFuncionario {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();

		for (int i = 0; i < 5; i++) {

			Funcionario f = new Funcionario();
			f.nome = "Danilo";
			f.salario = 1000 + 100 * i;
			f.departamento = "RH";
			f.rg = "754864";
			f.dataEntrada = new Data(01, 01, 2015);
			
			empresa.adiciona(f);
		}
		
		empresa.mostraEmpregados();

	}

}
