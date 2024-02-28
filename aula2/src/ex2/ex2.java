package ex2;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		
		 int N = 30;
		int rm[] = new int [N];
		double nota1[] = new double[N];
		double nota2[] = new double[N];
		double media[] = new double[N];

		int n;
		//entra em loop, até o usuario por o valor certo
		do {
		System.out.print("Informe quantidade de alunos (maximo " + N +"): ");
		n = le.nextInt();
		} while (n > 30);
		
		entradaDados(n, rm, nota1, nota2, le);
		
		calculaMedia(n, nota1, nota2, rm, media);
		
		
		int aprovados[] = new int[n];
		//explicação do nAp no metodo
		int nAp = geraListaAprovados( aprovados, media, rm, n);
		System.out.println("\n *** Listagem de Alunos Aprovados ***");
		for (int i = 0; i < nAp; i++) {
			System.out.println(aprovados[i]);
		}

	}

	private static int geraListaAprovados( int[] aprovados, double[] media, int[] rm, int n) {
		
		int nAp = 0; //numero de aprovados - eu so uso ele deves usar o i, pq o i vão armazenar TDS o processo, resumindo, TDS, agora quando eu crio uma variavel eu pulo oq n eh nota media e apago a casinha - foto no OneNote
		
		for (int i = 0; i < n; i++) {
			if (media[i] >= 6) {
				aprovados[nAp] = rm[i];
				nAp++;	
			}
		}
		
		return nAp;
		
	}

	private static void calculaMedia(int n, double[] nota1, double[] nota2, int[] rm, double[] media) {
		
		System.out.println(" *** RM e Media ***");
		for (int i = 0; i < n; i++) {
			media[i] = nota1[i] + nota2[i] / 2;
			System.out.println("RM: " + rm[i] + "\t media: " + media[i]);
		}		
	}

	private static void entradaDados(int n, int[] rm, double[] nota1, double[] nota2, Scanner le) {
		
		for (int i = 0; i < n; i++) {
			System.out.print("RM: ");
			rm[i] = le.nextInt();
			System.out.print("nota 1: ");
			nota1[i] = le.nextDouble();
			System.out.print("nota 2 : ");
			nota2[i] = le.nextDouble();
						
		}		
	}

}
