package filas;

public class FilaInt {

	public final int N = 6;
	int dados[] = new int[N];
	int ini, fim, cont;
	
	public void init() {
		ini = fim = cont = 0;
	}
	
	public boolean isEmpty() {
		return (cont==0); //se for vazia return true se n false
	}
	
	public boolean isFull() {
		return (cont==N);
	}
	
	public void enqueue(int elem) {
		if (isFull()) {
			System.out.println("Fila cheia");
		}else {
			dados[fim] = elem;
			fim = (fim+1) % N;
			cont++; //vai almentar pra esquerda, ent soma
		}
	}
	
	public int dequeue() {
		int elem = dados[ini];
		ini = (ini+1) % N; //garatir que fica rodando o ciclo 
		cont--; //vai diminuir ent subtrai
		return elem;
	}
	
	
	
}
