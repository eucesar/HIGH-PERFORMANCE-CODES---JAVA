package aplicacao;

import fila.FilaMensagens;
import entidades.Mensagem;
import java.util.Scanner;

public class AtendimentoMensagem {
    // Cesar iglesias - RM: 98007
    // Yan Gama - 99835

    public static void main(String[] args) {
        FilaMensagens filaReclamacao = new FilaMensagens();
        FilaMensagens filaSugestao = new FilaMensagens();
        FilaMensagens filaResolucao = new FilaMensagens();

        Scanner in = new Scanner(System.in);
        int opcao;
        boolean continuar = true; // Variável para controlar se o programa deve continuar executando
        do {
            exibirMenu();
            opcao = in.nextInt();
            in.nextLine(); // Limpar o buffer-teclado

            switch (opcao) {
                case 1:
                    receberMensagem(filaReclamacao, 1);
                    break;
                case 2:
                    receberMensagem(filaSugestao, 2);
                    break;
                case 3:
                    atenderMensagem(filaReclamacao, filaSugestao, filaResolucao);
                    break;
                case 4:
                    receberEncaminharResolucao(filaResolucao);
                    break;
                case 0:
                    // Verifica se todas as filas estão vazias antes de encerrar
                    if (filaReclamacao.isEmpty() && filaSugestao.isEmpty() && filaResolucao.isEmpty()) {
                        System.out.println("Encerrando o programa...");
                        continuar = false; // Define que o programa não deve continuar
                    } else {
                        System.out.println("Ainda há mensagens pendentes. Não é possível encerrar o programa.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (continuar); // Verifica se o programa deve continuar executando
    }

    public static void exibirMenu() {
        System.out.println("\nMenu de Opções:");
        System.out.println("1. Receber mensagem de reclamação");
        System.out.println("2. Receber mensagem de sugestão");
        System.out.println("3. Atender mensagem");
        System.out.println("4. Receber e encaminhar resolução");
        System.out.println("0. Encerrar o programa");
        System.out.print("Escolha uma opção: ");
    }

    public static void receberMensagem(FilaMensagens fila, int motivo) {
        Scanner in = new Scanner(System.in); 
        System.out.print("\nNome (opcional): ");
        String nome = in.nextLine();
        System.out.print("Email/Telefone: ");
        String emailTelefone = in.nextLine();
        System.out.print("Mensagem (texto): ");
        String texto = in.nextLine();

        Mensagem mensagem = new Mensagem(nome, emailTelefone, motivo, texto);
        fila.enqueue(mensagem);
        System.out.println("Mensagem recebida com sucesso!");
    }

    public static void atenderMensagem(FilaMensagens filaReclamacao, FilaMensagens filaSugestao, FilaMensagens filaResolucao) {
        Scanner in = new Scanner(System.in); // Renomeando o scanner para 'in'
        System.out.print("\nEscolha o tipo de mensagem para atender (1-reclamação/ 2-sugestão): ");
        int tipo = in.nextInt();
        in.nextLine(); // Limpar o buffer

        FilaMensagens filaAtendimento;
        if (tipo == 1) {
            filaAtendimento = filaReclamacao;
        } else {
            filaAtendimento = filaSugestao;
        }
        
        if (filaAtendimento.isEmpty()) {
            System.out.println("Não há mensagens desse tipo para atender no momento.");
            return;
        }

        Mensagem mensagem = filaAtendimento.dequeue();
        System.out.println("Mensagem selecionada para atendimento:");
        System.out.println("\nNome: " + mensagem.getNome());
        System.out.println("Email/Telefone: " + mensagem.getEmailTelefone());
        System.out.println("Mensagem: " + mensagem.getTexto());

        System.out.println("Simulando atendimento...");
        System.out.println("Enviada resposta para cliente: sua solicitação já foi resolvida. Obrigado!!!");

        if (mensagem.getMotivo() == 1) {
            System.out.print("\nDeseja encaminhar para resolução? (S/N): ");
            String resposta = in.nextLine().toUpperCase();
            if (resposta.equals("S")) {
                filaResolucao.enqueue(mensagem);
                System.out.println("Mensagem encaminhada para resolução.");
            }
        }
    }

    public static void receberEncaminharResolucao(FilaMensagens filaResolucao) {
        if (filaResolucao.isEmpty()) {
            System.out.println("Não há mensagens pendentes de resolução no momento.");
            return;
        }

        Mensagem mensagem = filaResolucao.dequeue();
        System.out.println("\nMensagem de resolução pendente selecionada:");
        System.out.println("\nNome: " + mensagem.getNome());
        System.out.println("Email/Telefone: " + mensagem.getEmailTelefone());
        System.out.println("Mensagem: " + mensagem.getTexto());

        System.out.println("Simulando envio de resolução...");
        System.out.println("Enviada resposta para cliente: sua solicitação já foi resolvida pelo setor responsável. Obrigado!!!");
    }
}