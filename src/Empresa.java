public class Empresa {

	private String nome;
	private String cnpj;
	private Funcionario funcionarios[];
	private static int posicaoArray = 0;
	
	public Empresa() {
		funcionarios = new Funcionario[10];
	}
	
	public Empresa(int qtdFuncionarios) {
		funcionarios = new Funcionario[qtdFuncionarios];
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public static int getPosicaoArray() {
		return posicaoArray;
	}

	public static void setPosicaoArray(int posicaoArray) {
		Empresa.posicaoArray = posicaoArray;
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public void adiciona(Funcionario funcionario) {
		if (posicaoArray < 10) {
			funcionarios[posicaoArray] = funcionario;
		}
		posicaoArray += 1;
	}

	public void mostraEmpregados() {
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] != null) {
				funcionarios[i].mostra();
			} else {
				break;
			}

		}
	}

	boolean contem(Funcionario f) {
		for (int i = 0; i < this.funcionarios.length; i++) {
			if (f == this.funcionarios[i]) {
				return true;
			}
		}
		return false;
	}
}
