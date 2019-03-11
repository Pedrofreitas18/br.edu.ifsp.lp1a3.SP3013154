package HeartRates;

import java.util.Scanner;

public class FrontEnd {
	
	private int diaHoje;
	private int mesHoje;
	private int anoHoje;
	public HeartRates coracao = null;
	
	//Construtor
	public FrontEnd(int diaHoje, int mesHoje, int anoHoje) {
    	setDiaHoje(diaHoje);
    	setMesHoje(mesHoje); 
    	setAnoHoje(anoHoje);
    	String nome = setNome();
    	String sobrenome = setSobrenome();
    	int diaNasc = setDiaNasc();
    	int mesNasc = setMesNasc();
    	int anoNasc = setAnoNasc();
    	HeartRates coracao = new HeartRates(nome, sobrenome, diaNasc, mesNasc, anoNasc);
    	this.coracao = coracao; 
    }
	
    //gets e sets
    public void setDiaHoje(int diaHoje) {
		this.diaHoje = diaHoje;
	}
    public int getDiaHoje() {
		return this.diaHoje;
	}
    
    public void setMesHoje(int mesHoje) {
		this.mesHoje = mesHoje;
	}
    public int getMesHoje() {
		return this.mesHoje;
	}
    
    public void setAnoHoje(int anoHoje) {
		this.anoHoje = anoHoje;
	}
    public int getAnoHoje() {
    	return this.anoHoje;
    }
	
    public static String setNome() {
    	String nome;
    	Scanner ler = new Scanner(System.in);
    	{
        	System.out.printf("Digite seu nome: ");
    		nome = ler.nextLine();
    	}while(nome == null); 
    	return nome;
    }
    public String getNome() {
    	return coracao.getNome();
    }
    
    public static String setSobrenome() {
    	String nome;
    	Scanner ler = new Scanner(System.in);
    	{
        	System.out.printf("Digite seu sobrenome: ");
    		nome = ler.nextLine();
    	}while(nome == null); 
    	return nome;
    }
    public String getSobrenome() {
        return coracao.getSobrenome();
    }
    
    public int setDiaNasc() {
    	int dia = 32;
    	Scanner ler = new Scanner(System.in);
    	while(dia > 31 || dia < 1) {
        	System.out.printf("Digite o dia do seu nascimento: ");
    		dia = ler.nextInt();
    	}
    	return dia;
    }
    public int getDiaNasc() {
    	return coracao.getDiaNasc();
    }
    
    public int setMesNasc() {
    	int mes = 13;
    	Scanner ler = new Scanner(System.in);
    	while(mes > 12 || mes < 1) {
        	System.out.printf("Digite o mes do seu nascimento: ");
    		mes = ler.nextInt();
    	}
    	return mes;
    }
    public int getMesNac() {
    	return coracao.getMesNasc();
    }
    
    public int setAnoNasc() {
    	int ano;
    	Scanner ler = new Scanner(System.in);
    	{
    	System.out.printf("Digite o ano do seu nascimento: ");
		ano = ler.nextInt();
    	}while(ano > getAnoHoje());
		return ano;
    	
    }
    public int getAnoNasc() {
    	return coracao.getAnoNasc();
    }
    //gets e sets fim
    
    public int getIdade() {
    	return coracao.getIdade(diaHoje, mesHoje, anoHoje);
    }
    
    public int getFrequenciaMaxima() {
    	return coracao.getFrequenciaMaxima(diaHoje, mesHoje, anoHoje);
    }
    
    public double getFrequenciaAlvo() {
    	return coracao.getFrequenciaAlvo(diaHoje, mesHoje, anoHoje);
    }

    public void exibirDados() {
    	System.out.println("Seu nome completo: "+getNome()+" "+getSobrenome());
		System.out.printf("Data de nascimento: "+getDiaNasc());
		System.out.println("/"+getMesNac()+"/"+getAnoNasc());
		System.out.println("Sua Idade: "+getIdade());
		System.out.println("Sua frequencia máxima: "+getFrequenciaMaxima());
		System.out.println("Sua frequencia alvo: "+getFrequenciaAlvo());
    }
}
