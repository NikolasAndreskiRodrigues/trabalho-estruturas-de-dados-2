import estruturas.Documentos;
import estruturas.EditorDeTexto;
import estruturas.Fila;
import estruturas.FilaImpressao;
import estruturas.Pilha;

public class PilhaApp 
{
    public static void main(String[] args) 
    { 
        Pilha pilha = new Pilha();
        pilha.empilhar("Texto1");
        pilha.empilhar("Texto2");
        pilha.empilhar("Texto3");
        pilha.empilhar("Texto4");
        pilha.empilhar("Texto5");
        pilha.empilhar("Texto6");
        pilha.desempilhar();
        pilha.estaVazia();  
        EditorDeTexto editor = new EditorDeTexto();
        editor.inserirTexto("Faça ou não faça, ");
        editor.mostrarTexto();
        editor.inserirTexto("tentativa não há");
        editor.mostrarTexto();
        editor.desfazer();
        editor.mostrarTexto();
        editor.refazer();
        editor.mostrarTexto();
        editor.inserirTexto(" apenas faça!");
        editor.mostrarTexto();
        editor.desfazer();
        editor.desfazer();
        editor.desfazer();
        editor.mostrarTexto();
        Fila fila = new Fila();
        fila.enfileirar("1");
        fila.enfileirar("2");
        fila.enfileirar("3");
        fila.imprimirFila(); 
        fila.desenfileirar();
        fila.imprimirFila();
        fila.estaVazia();
        fila.desenfileirar();
        fila.imprimirFila();
        fila.estaVazia();
        FilaImpressao filadeimpressao = new FilaImpressao(5);
        filadeimpressao.adicionarDocumento(new Documentos("agendadokaue.pdf", 1500));
        filadeimpressao.adicionarDocumento(new Documentos("tccdogabriel.docx", 80000));
        filadeimpressao.adicionarDocumento(new Documentos("fotodosorriso.png", 350));
        filadeimpressao.mostrarFila();
        filadeimpressao.imprimirProximo();
        filadeimpressao.imprimirProximo();
        filadeimpressao.mostrarFila();
    }
}
