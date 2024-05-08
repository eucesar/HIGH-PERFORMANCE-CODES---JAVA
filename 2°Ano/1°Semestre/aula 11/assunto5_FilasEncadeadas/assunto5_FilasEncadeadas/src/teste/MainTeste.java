package teste;

import filas.FilaInt;

public class MainTeste {

	public static void main(String[] args) {
		FilaInt fila = new FilaInt();
		fila.init();
		fila.enqueue(23);
		fila.enqueue(45);
		if (!fila.isEmpty())
			System.out.println(fila.dequeue());
		if (!fila.isEmpty())
			System.out.println(fila.dequeue());

	}

}
