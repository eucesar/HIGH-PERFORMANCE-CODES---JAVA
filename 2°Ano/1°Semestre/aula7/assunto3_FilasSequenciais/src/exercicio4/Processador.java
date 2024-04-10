package exercicio4;

import java.util.Scanner;

import filas.FilaInt;

public class Processador {

	public static void main(String[] args) {

		Scanner le = new Scanner(System.in);
		FilaInt fila = new FilaInt();
		
		fila.init();
		int opcao;
		do {
			System.out.println(" 1 - Inserir aluno na fila");
			System.out.println(" 2 - Executa processo (ocupa tempo de processador)");
			System.out.println(" 3 - Encerrar atendimento");
			System.out.println("coloque o valor: ");
			opcao = le.nextInt();
			switch (opcao) {
			case 1:
				System.out.print(" PID: ");
				int pid = le.nextInt();
				fila.enqueue(pid);
				break;
			case 2:
				if (!fila.isEmpty()) {
					pid = fila.dequeue();
					System.out.println("Processo que esta ocupando processador agora: " + pid);
					System.out.println("processo " + pid + "concluiu? (1-sim): ");
					int resp = le.nextInt();
					if (resp == 1) {
						System.out.println("Processo concluido");
					}else {
						System.out.println("Proceso " + pid + " voltou final da fila");
						fila.enqueue(pid);
					}
				}
				else
					System.out.println("Não ha processos na fila");
				break;
			case 3:
				if (!fila.isEmpty()) {
					System.out.println("Ainda ha processos na fila");
					System.out.println("Deseja encerrar todos os processos? (1-sim)");
					int resp = le.nextInt();
					if (resp == 1) {
						while (!fila.isEmpty()) { //encerrar tudo - 1 por 1
							System.out.println("Processo " + fila.dequeue() + " foi encerrado");
						}
					}
					else
						opcao = 0; //so para n deixar fechar o programa se eu n quiser encerrar, volta pro começo - n deixa encerrar
				}
				break;
			default:
				System.out.println("Opcao Invalida");
			}
		} while (opcao != 3); //encerra valor
		System.out.println("Shutdown...");
		le.close();

	}

}
