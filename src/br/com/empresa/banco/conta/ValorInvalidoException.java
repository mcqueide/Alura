package br.com.empresa.banco.conta;
public class ValorInvalidoException extends RuntimeException {

	public ValorInvalidoException() {
		super();
	}

	public ValorInvalidoException(String mensagem) {
		super(mensagem);
	}

	public ValorInvalidoException(double valor) {
		super("Valor invalido: " + valor);
	}

}
