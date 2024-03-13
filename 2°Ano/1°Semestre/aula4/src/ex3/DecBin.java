package ex3;

import java.util.Scanner;

import pilhas.PilhaInt;

public class DecBin {

	public static void main(String[] args) {

		Scanner le = new Scanner(System.in);
		PilhaInt pilha = new PilhaInt();
		pilha.init();
		
		System.out.print("Decimal: ");
		int decimal = le.nextInt();
		
		int resto;
		//quando muda o valor entra em loop dnv
		while(decimal != 0) {
			resto = decimal % 2;
			pilha.push(resto);
			decimal = decimal / 2;
		}
		
		System.out.println(decimal); //faz até o valor ser 0
		System.out.print("Binario: ");
		pilha.esvazia();
	}

}
