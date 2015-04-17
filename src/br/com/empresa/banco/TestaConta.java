package br.com.empresa.banco;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1000); 
		cc.deposita(1000); 
		cp.deposita(1000);
		
		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		System.out.printf("O saldo �: %.2f\n", c.getSaldo());
		System.out.printf("O saldo �: %.2f\n", cc.getSaldo());
		System.out.printf("O saldo �: %.2f\n", cp.getSaldo());
		
	}
	
     
}
