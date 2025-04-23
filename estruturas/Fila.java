package estruturas;

public class Fila {
    private String[] elementos;
    private int capacidade;
    private int comeco;
    private int topo;

    public Fila() {
        this.capacidade = 10;
        this.elementos = new String[this.capacidade];
        this.comeco = 0;
        this.topo = 0;
    }

    public void enfileirar(String elemento) {
        if (topo >= capacidade) {
            System.out.println("A fila está cheia");
        }
        elementos[topo] = elemento;
        topo++;
    }

    public String desenfileirar() {
        if (comeco < topo) {
            String elemento = elementos[comeco];
            comeco++;
            return elemento;
        } else {
            throw new IllegalStateException("A fila está vazia");
        }
    }

    public void estaVazia() {
        if (comeco == topo) {
            System.out.println("A fila está vazia");
        } else {
            System.out.println("A fila não está vazia");
        }
    }

    public void imprimirFila() {
        if (comeco == topo) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.print("Fila: ");
            for (int i = comeco; i < topo; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}