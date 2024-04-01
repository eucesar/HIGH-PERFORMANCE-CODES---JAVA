package aplicacao;

import pilhas.PilhaInt; //tem q importar pack

public class MainTeste {

	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt();
		pilha.init();
		
		pilha.push(10);
		pilha.push(12);
		pilha.push(14);
		pilha.push(15);
		pilha.push(16);
		pilha.push(16); //estou exibindo esse mas so  esta aprecendo e pula para o de baixo
		pilha.push(0); //stack over
	
		

		//MSM MANEIRA DE ESCREVER Q O 'IF' DE BAIXO - ponto de exclamação sozinho significa ao contrario de true = false
		//o if daqui inverte com o else do 'pilhaInt' e o else daqui inverte com o if da 'pilhaInt' no isEmpty()
		if (!pilha.isEmpty()) {
			System.out.println("Pilha q esta em cima: " + pilha.top()); 
		}else {
			System.out.println("Pilha Vazia");
		}
		if (pilha.isEmpty() != true) {
			System.out.println("Valor retirado da pilha: " + pilha.pop()); 
		}else {
			System.out.println("Pilha Vazia");
		}		
		if (pilha.isEmpty() != true) {
			System.out.println("Valor retirado da pilha: " + pilha.pop()); 
		}else {
			System.out.println("Pilha Vazia");
		}
		if (pilha.isEmpty() != true) {
			System.out.println("Valor retirado da pilha: " + pilha.pop()); 
		}else {
			System.out.println("Pilha Vazia");
		}
		if (pilha.isEmpty() != true) {
			System.out.println("Valor retirado da pilha: " + pilha.pop());
		}else {
			System.out.println("Pilha Vazia");
		}
		if (pilha.isEmpty() != true) {
			System.out.println("Valor retirado da pilha: " + pilha.pop());
		}else {
			System.out.println("Pilha Vazia");
		}
		
		

	}
}
