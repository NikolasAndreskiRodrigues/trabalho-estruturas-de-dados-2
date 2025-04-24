package estruturas;

public class Documentos {
    private String nome;
    private int tamanho;

    public Documentos(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "Documento: " + nome + " (" + tamanho + " KB)";
    }
}

