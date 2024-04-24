package exemplo3;

public class ListaEncadeada {

	public static void main(String[] args) {

		NoLista lista = new NoLista();
		lista.dado = 1;
		lista.prox = null;
		
		
		NoLista novo = new NoLista();
		novo.dado = 2;
		novo.prox = null;
		lista.prox = novo;
		
		NoLista novo2 = new NoLista();
		novo2.dado =3; //muda de posição da 1°
		novo2.prox = lista;
		lista = novo2; //LISTA VAI arazanar todo o objeto novo2
		
		
		//System.out.println(lista.dado);
		//System.out.println(lista.prox.dado); //1° NO
		//System.out.println(lista.prox.prox.dado); //2° NO
		
		NoLista aux = lista;
		while (aux != null) {
			System.out.println(aux.dado);
			aux = aux.prox;
		}
		
	}

}
