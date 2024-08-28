package aplicacao;

import java.util.Scanner;

import arvore.ABBBINT;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		ABBBINT abb = new ABBBINT();
		int opcao;
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - inserir");
			System.out.println("2 - apresentar");
			System.out.println("3 - apresentar");
			opcao = le.nextInt();
			switch (opcao) {
			case 0: 
				System.out.println("Encerrado o programa");
				break;
			case 1:
				System.out.println("valor a ser inseriodo na ABB");
				int valor = le.nextInt();
				abb.root = abb.inserir(abb.root, valor);
				break;
			case 2: 
				System.out.println("\n ***  Apresentacao da ABB ***");
				abb.show(abb.root);
				System.out.println();
				break;
			case 3: 
				System.out.println("Quantidade de nos na ABB: " + abb.contaNos(abb.root, 0));
				
			default: 
				System.out.println("Opcao Invalida");
			}
		}while(opcao != 0);
	}
	
}
