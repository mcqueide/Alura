
public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getFormatada(){
		return String.format("%d/%d/%d", dia,mes,ano);
	}
}
