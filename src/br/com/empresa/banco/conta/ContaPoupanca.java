package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta{

	@Override
	public void atualiza(double taxa) {
	
		this.saldo *= (taxa * 3);
		
	}
	
	public void deposita(double saldo) {
		
		double taxaBancaria = 0.10;
		super.deposita(saldo - taxaBancaria);
	
	}
	
}
