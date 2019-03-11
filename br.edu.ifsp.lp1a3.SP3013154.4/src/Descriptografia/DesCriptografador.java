package Descriptografia;

public class DesCriptografador {
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
	
	public void desCriptografar() {
		int intermediario;
		
		intermediario = getTerceiroDigito();
		setTerceiroDigito(getPrimeiroDigito());
		setPrimeiroDigito(intermediario);
		
		intermediario = getSegundoDigito();
		setSegundoDigito(getQuartoDigito());
		setQuartoDigito(intermediario);
		
		setPrimeiroDigito((getPrimeiroDigito()*10)-7);
		setSegundoDigito((getSegundoDigito()*10)-7);
		setTerceiroDigito((getTerceiroDigito()*10)-7);
		setQuartoDigito((getQuartoDigito()*10)-7);
		
		correcaoDigitos();
	    //nota: a "criptografia" proposta pelo exercício não funciona na prática
	}
	
	public String printDigitos() {
		String numero = new String(Integer.toString(getPrimeiroDigito())+
				                   Integer.toString(getSegundoDigito())+
				                   Integer.toString(getTerceiroDigito())+
				                   Integer.toString(getQuartoDigito()));	
		return numero;
	}

	public void correcaoDigitos() {
		if(getPrimeiroDigito() < 0) {
			setPrimeiroDigito(0);
		}
		
		if(getSegundoDigito() < 0) {
			setSegundoDigito(0);
		}
		
		if(getTerceiroDigito() < 0) {
			setTerceiroDigito(0);
		}
		
		if(getQuartoDigito() < 0) {
			setQuartoDigito(0);
		}
	}		
}
