package entidades;

public class Mensagem {
    // Cesar iglesias - RM: 98007
    // Yan Gama - 99835
    private String nome;
    private String emailTelefone;
    private int motivo;
    private String texto;

    public Mensagem(String nome, String emailTelefone, int motivo, String texto) {
        this.nome = nome;
        this.emailTelefone = emailTelefone;
        this.motivo = motivo;
        this.texto = texto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmailTelefone() {
        return emailTelefone;
    }

    public void setEmailTelefone(String emailTelefone) {
        this.emailTelefone = emailTelefone;
    }

    public int getMotivo() {
        return motivo;
    }

    public void setMotivo(int motivo) {
        this.motivo = motivo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
