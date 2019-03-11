package Descriptografia;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    	DesCriptografador Crip = new DesCriptografador(); 
    	int numero = 10000;
		
    	Scanner ler = new Scanner(System.in);
    	
    	while(numero >9999 || numero <0) {
        	System.out.printf("Digite o número: ");
    		numero = ler.nextInt();
    	}
    	
    	Crip.setDigitos(numero);
    	Crip.desCriptografar();
    	System.out.printf("Número descriptografado: "+Crip.printDigitos());
    }
}
