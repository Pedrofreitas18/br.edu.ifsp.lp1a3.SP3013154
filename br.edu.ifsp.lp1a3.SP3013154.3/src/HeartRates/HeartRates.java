package HeartRates;

public class HeartRates {
	private String nome;
    private String sobrenome;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
	
    //Construtor
    public HeartRates(String nome, String sobrenome, int diaNasc, int mesNasc, int anoNasc) {
    	setNome(nome);
    	setSobrenome(sobrenome);
    	setDiaNasc(diaNasc);
    	setMesNasc(mesNasc);
    	setAnoNasc(anoNasc);
    }
    
    //gets e sets
	public void setNome(String nome) {
		this.nome = nome;
	}
    public String getNome() {
		return this.nome;
	}
    
    public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
    public String getSobrenome() {
		return this.sobrenome;
	}
    
    public void setDiaNasc(int diaNasc) {
		this.diaNasc = diaNasc;
	}
    public int getDiaNasc() {
		return this.diaNasc;
	}
    
    public void setMesNasc(int mesNasc) {
		this.mesNasc = mesNasc;
	}
    public int getMesNasc() {
		return this.mesNasc;
	}
    
    public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
    public int getAnoNasc() {
		return this.anoNasc;
	}
    //gets e sets fim
    
    public int getIdade(int diaHoje, int mesHoje, int anoHoje) {
    	int idade = anoHoje-getAnoNasc()-1;
    	int mes = getMesNasc();
    	if (mesHoje > mes) {
    		idade++;
    	}else {
    		if(mesHoje == mes) {
    			if (diaHoje >= getDiaNasc()) {
    				idade++;
    			}
    		}
    	}
    	return idade;
    }
	
	public int getFrequenciaMaxima(int diaHoje, int mesHoje, int anoHoje) {
		return 220 - getIdade(diaHoje, mesHoje, anoHoje);
	}

	public double getFrequenciaAlvo(int diaHoje, int mesHoje, int anoHoje) {
		return getFrequenciaMaxima(diaHoje, mesHoje, anoHoje) * 0.675 ;
	}

}
