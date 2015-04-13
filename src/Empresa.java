
public class Empresa {
	
	private String nome;
	private String cnpj;
	public Funcionario funcionarios[];
	static int posicaoArray = 0;
	
	public Empresa() {
		funcionarios = new Funcionario[10];
	}
	
	public void adiciona(Funcionario funcionario){
		if (posicaoArray <10) {
			funcionarios[posicaoArray] = funcionario;
		}
		posicaoArray += 1;
	}
	
	public void mostraEmpregados(){
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] != null) {
				funcionarios[i].mostra();
			}else{
				break;
			}
			
		}
	}
	
}
