import estruturas.EditorTexto;
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

        EditorTexto editor = new EditorTexto();
        editor.inserirTexto("Texto 7");
        editor.inserirTexto("Texto 8"); 
        editor.desfazer();
        editor.refazer();


        
    }
}
