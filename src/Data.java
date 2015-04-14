
public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		setAno(ano);
		setMes(mes);
		setDia(dia);
	}

	public void setDia(int dia) {
		if (mes == 2) {
			if ((ano % 4 == 0 && ano % 100 != 0 ) || ano % 400 == 0) {
				if (dia>=1 && dia<=29) {
					this.dia = dia;
					return;
				}else{
					this.dia = 1; //manter um valor consistente
				}
			}else{
				if (dia>=1 && dia<=28) {
					this.dia = dia;
					return;
				}else{
					this.dia = 1; //manter um valor consistente
				}
			}
			
		}else
		if (mes % 2 == 1 && !(mes == 9 || mes == 11) || (mes==8 || mes==10 || mes ==12)) {
			if (dia>=1 && dia<=31) {
				this.dia = dia;
				return;
			}
		}else{
			if (dia>=1 && dia<=30) {
				this.dia = dia;
				return;
			}
			this.dia = 1; //manter um valor consistente
		}
	}



	public void setMes(int mes) {
		if (mes >=1 && mes<=12) {
			this.mes = mes;			
		}else{
			this.mes = 1; //deixar um valor consistente
		}
		
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public String getFormatada(){
		return String.format("%d/%d/%d", dia,mes,ano);
	}
}
