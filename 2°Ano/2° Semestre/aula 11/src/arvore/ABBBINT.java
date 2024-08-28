package arvore;

public class ABBBINT {

	private class ARVORE{
		int dado;
		ARVORE esq;
		ARVORE dir;
	}

	//para colocar o valor da arovore preciso da referencia para uma arvore, publico para fazer operação numerica
	public ARVORE root = null; //root = raiz, primeira
	 
	public ARVORE inserir(ARVORE p, int info) {
		// insere elemento em uma ABB, na arvore
		if (p == null) {
			p = new ARVORE(); 
			p.dado = info; //informação = leitura do dado - primeiro ele so armazena
			p.esq = null;
			p.dir = null;
		}
		else if (info < p.dado) 
			p.esq= inserir (p.esq, info);
		     else
			p.dir=inserir(p.dir, info);	
		return p;
	}
	
	public void show(ARVORE p) { //apresentar nos da arvore
		if (p != null) {
			show(p.esq);
			System.out.println("\t" + p.dado);
			show(p.dir); //tanto faz a ordem
		}
	}
	
	public int contaNos(ARVORE p, int cont) {
		if (p != null) {
			cont++;
			cont = contaNos(p.esq, cont);
			cont = contaNos(p.dir, cont);
		}
		return cont;
	}	

}
