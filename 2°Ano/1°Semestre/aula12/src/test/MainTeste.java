package test;

import java.util.Scanner;

import lista.ListaCrescenteInt;

public class MainTeste {

	public static void main(String[] args) {

			Scanner le = new Scanner(System.in);
			
			ListaCrescenteInt lista = new ListaCrescenteInt();
			int valor;
			System.out.println("Informe inteiro positivo para inserir ou negativo para encerrar: ");
			valor = le.nextInt();
			while (valor >= 0) {
				lista.add(valor);
				lista.show();
				System.out.println("Informe inteiro positivo para inserir ou negativo para encerrar: "); //repetir, se n encerra, comos e fosse um for it
				valor = le.nextInt();
			}
			
			
			le.close();
	}

}
