package exemplo2;

public class ListaEncadeada2 {

	public static void main(String[] args) {

				NoLista lista = new NoLista();
				lista.dado = 1;
				lista.prox = null; //APONTA PRO CHÃO - para zerar e depois ordenar lista dinamica, forma abstrata
				System.out.println("lista: " + lista);
				System.out.println("\t dado: " + lista.dado);
				System.out.println("\t prox: " + lista.prox);
				
				NoLista novo = new NoLista(); //criar novo obejto, zera
				novo.dado = 2;
				novo.prox = novo;
				lista.prox = novo; //armazenou o 2
				System.out.println("\n\n Depois do 2o no");
				System.out.println("lista: "+lista);
				System.out.println("\t dado: " + lista.dado);
				System.out.println("\t prox: " + lista.prox); //já armazena o novo como configurei nesse metodo. no começo
				
				System.out.println("novo: " + novo);
				System.out.println("\t dado: " + novo.dado);
				System.out.println("\t prox: " + novo.prox);
				
		
	}

}
