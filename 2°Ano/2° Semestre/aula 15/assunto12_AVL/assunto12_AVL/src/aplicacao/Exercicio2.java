package aplicacao;

import java.util.Scanner;

import arvores.AVLINT;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		AVLINT avl = new AVLINT();
		int opcao;
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir");
			System.out.println("2- Apresentar FB de cada no da AVL");
			System.out.println("3- resomve valor");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				break;
			case 1:
				System.out.print("Informe valor a ser inserido: ");
				int valor = le.nextInt();
				avl.root = avl.inserirAVL(avl.root, valor);
				avl.atualizaAlturas(avl.root);
				break;
			case 2:
				System.out.println("*** Apresentacao dos nos da AVL ***");
				avl.mostraFB(avl.root);
				break;
			case 3:
				System.out.println("Informe valor a ser removido:");
				valor = le.nextInt();
				avl.root = avl.removeValor(avl.root, valor);
				avl.root = avl.atualizaAlturaBalanceamento(avl.root);
				break;
			default:
				System.out.println("Opcao invalida");
			}
		} while (opcao != 0);
		le.close();

	}

}
