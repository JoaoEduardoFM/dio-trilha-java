package desafioList;

public class Temperatura {
	
	Double temperatura;
	String mes;
	
	public Double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public Temperatura(Double temperatura, String mes) {
		super();
		this.temperatura = temperatura;
		this.mes = mes;
	}
	@Override
	public String toString() {
		return "Temperatura [temperatura=" + temperatura + ", mes=" + mes + "]";
	}
	
	
}
