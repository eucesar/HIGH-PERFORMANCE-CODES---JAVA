package exercicio4;

public class Paciente {
	String nome;
	int idade;
	public Paciente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public Paciente() {
		
	}
	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", idade=" + idade + "]";
	}
	
}
