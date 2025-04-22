package estruturas;

public class EditorTexto 
{
    Pilha desfazer = new Pilha();
    Pilha refazer = new Pilha();
    String[] textoAtual = new String[10];

    
    public void inserirTexto(String texto){
        desfazer.empilhar(texto);
        refazer.limpar();
        textoAtual[-1] = texto;
    }
    public void desfazer(){
        refazer.empilhar(desfazer.desempilhar());
        textoAtual[-1] = null;
    }
    public void refazer(){
        desfazer.empilhar(refazer.desempilhar());
        textoAtual[-1] = refazer.desempilhar();
    }
    


}
