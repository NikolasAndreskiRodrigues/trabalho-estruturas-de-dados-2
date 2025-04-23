package estruturas;

public class EditorDeTexto {
    private Pilha pilhaDesfazer = new Pilha();
    private Pilha pilhaRefazer = new Pilha();
    String textoAtual = "";

    public void inserirTexto(String novoTexto) {
        pilhaDesfazer.empilhar(textoAtual);
        pilhaRefazer = new Pilha();
        textoAtual += novoTexto;
    }

    public void desfazer() {
        if (pilhaDesfazer != null) {
            pilhaRefazer.empilhar(textoAtual);
            textoAtual = pilhaDesfazer.desempilhar();
        } else {
            System.out.println("Pilha vazia");
        }
    }

    public void refazer() {
        if (pilhaRefazer != null) {
            pilhaDesfazer.empilhar(textoAtual);
            textoAtual = pilhaRefazer.desempilhar();
        } else {
            System.out.println("Não tem o que refazer");
        }
    }

    public void mostrarTexto() {
        System.out.println(textoAtual);
    }
}