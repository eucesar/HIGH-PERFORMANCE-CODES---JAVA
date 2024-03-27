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
		
		//n<pilha.N so para n passar
		while (digito >= 0 && (n<pilha.N)) {
			lido[n] = digito;
			n++; //adicionar cada digito no vetor
			pilha.push(digito);
			
			System.out.print("informe digito 0..9 (negativo para encerrar) --> ");
			digito = le.nextInt();
		}
		n=0;
		while (!pilha.isEmpty()) {
			invertido[n] = pilha.pop(); //ent tudo que vai tirando vai adicionando no vetor invertido
			n++;
			
		}
		
		boolean palindromo = true;
		for (int i = 0; i < n && palindromo; i++) { //se o palindromo for vdd
			if (lido[i] != invertido[i]) { // se os digitos forem diferentes, mesmo invertido - agora sé forem iguais é palindromo, ex: normal : 0 - invertido : 0
				palindromo = false; //se for diferente n vai rodar
			}
		}
		
		if (palindromo) {
			System.out.println("É palindromo");
		}else {
			System.out.println("Não é palindromo");
		}
		le.close();
		//o valor 7 n armazena
	}
}
