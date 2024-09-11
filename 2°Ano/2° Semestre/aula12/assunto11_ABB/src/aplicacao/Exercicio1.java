package aplicacao;

import java.util.Scanner;

import arvores.ABBINT;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		ABBINT abb = new ABBINT();
		int opcao;
		do {
			System.out.println("0 - Sair");
			System.out.println("1- Inserir");
			System.out.println("2- Apresentar");
			System.out.println("3- Apresenta quantidade de nos na ABB");
			System.out.println("4- Pesquisa  se um valor está na presente na ABB");
			System.out.println("5- Conta quantidade de compracoes na pesquisa de um valor");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Encerrado o programa");
				break;
			case 1:
				System.out.print("Valor a ser inserido na ABB: ");
				int valor = le.nextInt();
				abb.root = abb.inserir(abb.root, valor);
				break;
			case 2:
				System.out.println("\n *** Apresentacao da ABB ***");
				abb.show(abb.root);
				System.out.println();
				break;
			case 3:
				System.out.println("Quantidade de nos na ABB: "+ abb.contaNos(abb.root, 0));
				// FAZER TESTE DE MESA
				break;
			case 4: 
				System.out.print("Valor a procurar na ABB: ");
				valor = le.nextInt();
				if (abb.consulta(abb.root, valor)) {
				System.out.println("Valor a ser presente na ABB: ");
				}
				else {
					System.out.println("Opção inválida");
				}
				break;
				
			case 5:
				System.out.println("Valor a ser pesquisado na ABB");
				valor = le.nextInt();
				int contador = abb.contaConsulta(abb.root, valor, 0); // o 0 é o valor inicial do contador
				System.out.println("quantidade de comparações"  +  contador);
			default:
				System.out.println("Opcao invalida");
			}

		} while (opcao != 0);
		le.close();

	}

}
