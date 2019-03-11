package Criptografia;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    	Criptografador Crip = new Criptografador(); 
    	int numero = 10000;
		
    	Scanner ler = new Scanner(System.in);
    	
    	while(numero >9999 || numero <0) {
        	System.out.printf("Digite o número: ");
    		numero = ler.nextInt();
    	}
    	
    	Crip.setDigitos(numero);
    	Crip.criptografar();
    	System.out.printf("Número criptografado: "+Crip.printDigitos());	
	}
}
