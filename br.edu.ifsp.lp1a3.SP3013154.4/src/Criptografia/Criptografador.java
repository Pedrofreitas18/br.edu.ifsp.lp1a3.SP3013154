package Criptografia;

public class Criptografador {
	private int primeiroDigito;
	private int segundoDigito;
	private int terceiroDigito;
	private int quartoDigito;
	
	public void setDigitos(int numero) {
		setPrimeiroDigito(numero/1000);
		setSegundoDigito((numero/100) - (getPrimeiroDigito()*10));
		setTerceiroDigito((numero/10) - (getPrimeiroDigito()*100) - (getSegundoDigito()*10));
		setQuartoDigito((numero) - (getPrimeiroDigito()*1000) - (getSegundoDigito()*100) - (getTerceiroDigito()*10));
	}
	
	public void setPrimeiroDigito (int digito) {
		primeiroDigito = digito ;
	}
	public int getPrimeiroDigito () {
		return primeiroDigito;
	}
	
	public void setSegundoDigito (int digito) {
		segundoDigito = digito ;
	}
	public int getSegundoDigito () {
		return segundoDigito;
	}
	
	public void setTerceiroDigito (int digito) {
		terceiroDigito = digito;
	}
	public int getTerceiroDigito () {
		return terceiroDigito;
	}
	
	public void setQuartoDigito (int digito) {
		quartoDigito = digito;
	}
	public int getQuartoDigito () {
		return quartoDigito;
	}
	
	public void criptografar() {
				
		setPrimeiroDigito((getPrimeiroDigito()+7)/10);
		setSegundoDigito((getSegundoDigito()+7)/10);
		setTerceiroDigito((getTerceiroDigito()+7)/10);
		setQuartoDigito((getQuartoDigito()+7)/10);
		
		int intermediario;
		
		intermediario = getTerceiroDigito();
		setTerceiroDigito(getPrimeiroDigito());
		setPrimeiroDigito(intermediario);
		
		intermediario = getSegundoDigito();
		setSegundoDigito(getQuartoDigito());
		setQuartoDigito(intermediario);
		
	    //nota: a "criptografia" proposta pelo exercício não funciona na prática
	}
	
	public String printDigitos() {
		String numero = new String(Integer.toString(getPrimeiroDigito())+
				                   Integer.toString(getSegundoDigito())+
				                   Integer.toString(getTerceiroDigito())+
				                   Integer.toString(getQuartoDigito()));	
		return numero;
	}
}
