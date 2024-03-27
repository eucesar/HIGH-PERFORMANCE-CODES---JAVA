package exercicio4;

import java.util.Scanner;

import pilhas.PilhaInt;

public class Polindromo {
	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		PilhaInt pilha = new PilhaInt();
		pilha.init();
		int digito;
		int lido[] = new int[pilha.N];
		int invertido[] =  new int[pilha.N];
		int n=0;
		
		System.out.print("informe digito 0..9 (negativo para encerrar) --> ");
		digito = le.nextInt();
		
		while (digito >= 0 && (n<pilha.N)) {
			lido[n] = digito;
			n++;
			pilha.push(digito);
			
			System.out.print("informe digito 0..9 (negativo para encerrar) --> ");
			digito = le.nextInt();
		}
		n=0;
		while (!pilha.isEmpty()) {
			invertido[n] = pilha.pop();
			n++;
			
		}
		
		boolean palindromo = true;
		for (int i = 0; i < n && palindromo; i++) {
			if (lido[i] != invertido[i]) {
				palindromo = false;
			}
		}
		
		if (palindromo) {
			System.out.println("É palindromo");
		}else {
			System.out.println("Não é palindromo");
		}
		le.close();
		
	}
}
