package br.com.empresa.banco.conta;
public abstract class Conta {

	protected double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double saldo) {
		if (saldo <= 0) {
			throw new ValorInvalidoException(saldo);
		} else {
			this.saldo += saldo;
		}
	}

	public void saca(double saldo) {
		if (this.saldo >= saldo) {
			this.saldo -= saldo;
		}
	}

	public abstract void atualiza(double taxa);

}
