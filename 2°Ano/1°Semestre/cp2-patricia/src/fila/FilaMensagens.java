package fila;

import entidades.Mensagem; 

public class FilaMensagens {
	
    // Cesar iglesias - RM: 98007
    // Yan Gama - 99835
	
    private static class No {
        Mensagem mensagem;
        No proximo;

        public No(Mensagem mensagem) {
            this.mensagem = mensagem;
            this.proximo = null;
        }
    }

    private No inicio;
    private No fim;

    public FilaMensagens() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void enqueue(Mensagem mensagem) {
        No novoNo = new No(mensagem);
        if (isEmpty()) {
            inicio = novoNo;
        } else {
            fim.proximo = novoNo;
        }
        fim = novoNo;
    }

    public Mensagem dequeue() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
            return null;
        }
        Mensagem mensagemRemovida = inicio.mensagem;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        return mensagemRemovida;
    }
}
