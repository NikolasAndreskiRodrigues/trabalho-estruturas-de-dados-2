package estruturas;

public class EditorTexto {
    private Pilha pilhaDesfazer = new Pilha();
    private Pilha pilhaRefazer = new Pilha();
    private String textoAtual = "";

    public void inserirTexto(String texto) {
        pilhaDesfazer.empilhar(textoAtual); 
        pilhaRefazer.limpar(); 
        textoAtual = texto; 
    }

    public void desfazer() {
        if (pilhaDesfazer.estaVazia2()) {
            System.out.println("Nada para desfazer.");
            return;
        }
        pilhaRefazer.empilhar(textoAtual); 
        textoAtual = pilhaDesfazer.desempilhar(); 
    }

    public void refazer() {
        if (pilhaRefazer.estaVazia2()) {
            System.out.println("Nada para refazer.");
            return;
        }
        pilhaDesfazer.empilhar(textoAtual); 
        textoAtual = pilhaRefazer.desempilhar(); 
    }

    public String getTextoAtual() {
        return textoAtual;
    }
}
