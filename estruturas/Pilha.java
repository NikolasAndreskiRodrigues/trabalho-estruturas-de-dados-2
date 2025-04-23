package estruturas;
public class Pilha{
    private String[] elementos;
    private int topo;
    private int capacidade;

    public Pilha(){
        this.capacidade = 10;
        this.elementos = new String[this.capacidade];
        this.topo = -1;
    }
    public void empilhar(String elemento){
        topo++;
        elementos[topo] = elemento;
    }
    public String desempilhar(){
        if(topo >= 0){
            String elemento = elementos[topo];
            topo--;
            return elemento;
        }
        else{
            throw new IllegalStateException("A pilha está vazia");
        }
    }
    public void estaVazia(){
        if(topo < 0){
            System.out.println("A pilha está vazia");
        }
        else{
            System.out.println("A pilha não está vazia");
        }
    }

    public void limpar(){
        topo = -1;
    }
}