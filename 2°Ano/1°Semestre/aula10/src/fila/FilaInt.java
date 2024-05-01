package fila;

public class FilaInt {
    
	private class NO{
		int dado;
		NO prox;
	}
	
	NO ini, fim; //referencia de começo e final da lista - variavel de referencia
	
	public void init() {
		ini = fim = null; //null no sentido de disponivel campo - ent ele vai apontar para null = quando ini e fim apontarem para uma mesma alocação da memoria - que n tem nada colocado ainda
	}
	
	public boolean isEmpty() {
		return (ini == null && fim == null); //se for nulo é mt já esta tudo cheio entao aponta para o nada o 0 - tem coisa dentro e aponta para nada, pq ini e fim chegaram no limite, na mesma locação na memoria, no mesmo campo - e quando esta tudo cheio ele n aponta pra ninguem pq n tem ninguem pra apontar pq já esta completamento cheio
	}
	
	public void enqueue (int elem) {
		NO novo = new NO();
		novo.dado = elem;
		novo.prox = null;
		if (isEmpty()) { //tem q ter o isEmpty pq se n ele n mostra como null
			ini = novo;
		}else {
			fim.prox = novo;
		}
		
		//para inserir o fim no prximo, so no começo eu uso ini, dps eu vou colocando so fim fim fim... pq so vai subtituindo o proximo - é uma fila - sempre alocado n final
		fim = novo;
		
	
	}
	
	//verificar se tem valor no ini - dado que n existe pq tem vario ini de varios dados, então de qual ? dai returna nulo
	public int first() {
		return (ini.dado);
	}
	
	public int dequeue() {
		int valor = ini.dado;
		ini = ini.prox;
		
		if (ini == null) {
			fim = null;
		}
		return valor; //vai apagar o valor de fim
	}
	
	
}
