package exercicio4;

import java.util.Scanner;

import filas.FilaPaciente;

public class AtendePacientes2 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		FilaPaciente fila = new FilaPaciente();
		fila.init();
		int op;
		do {
			System.out.println(" 1- Insere paciente na fila");
			System.out.println(" 2- Atende um paciente");
			System.out.println(" 3- Encerra atendimento");
			op = le.nextInt();
			switch (op) {
			case 1:
				System.out.print("Nome do paciente: ");
				le.nextLine();
				String nome = le.nextLine();
				System.out.print(" Idade: ");
				int idade = le.nextInt();
				Paciente pac = new Paciente(nome,idade);
				fila.enqueue(pac);
				break;
			case 2:
				if (!fila.isEmpty()) {
					System.out.println("Paciente a ser atendido agora: " + fila.dequeue());
				} else {
					System.out.println("Nao ha pacientes aguardando na fila");
				}
				break;
			case 3:
				if (fila.isEmpty())
					System.out.println("Encerrado o atendimento");
				else {
					System.out.println("Ainda ha pacientes na fila");
					op = 0;
				}
				break;
			default:
				System.out.println("Opcao Invalida");
			}
		} while (op != 3);

		le.close();

	}

}
