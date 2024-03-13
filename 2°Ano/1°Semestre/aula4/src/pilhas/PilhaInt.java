package pilhas;

public class PilhaInt {
	
	//final - dizer q é constante
	public final int N = 6;
	int dados[] = new int[6];
	int topo;
	
	//iniciar - topo - coloca valor - 10 na imagem
	public void init() {
		topo = 0;
	}
	
	
	//empurrar - add mais um do lado - 12 na imagem
	//int elemento
	public void push(int elem) {
		if (isFull()) {
			//pilha cheia
			System.out.println("Stack OverFlow");
		}else {
			dados[topo] = elem;
			topo++; //soma mais um valor na pilha, mais um quadradinho
		}

	}
	
	//quando esta cheio
	public boolean isFull() {
		if (topo == N) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//quando o valor está zerada e quer retirar valor
	public boolean isEmpty() {
		if (topo == 0) {
			return true;
		}
		else { //false executa normal
			return false;
		}
	}
	
	//sair do topo da pilha um elemento - deleta o ultimo colocado , no caso o push de cima 
	public int pop() {
		topo--;
		return(dados[topo]);
	}
	
	//para ver quem esta no topo
	public int top() {
		return(dados[topo - 1]);
	}
	
	//vai tirar um por do loop
	public void esvazia() {
		while (!isEmpty()) {
			System.out.print(pop() + " ");
		
		}
	}
}
