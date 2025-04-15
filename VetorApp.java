import estruturas.Iterador;
import estruturas.Lista;
import estruturas.Vetor;
import java.util.Scanner;

public class VetorApp {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in); 

        
        vetor.adicionar(2);
        vetor.adicionar(7);
        vetor.adicionar(9);
        vetor.adicionar(12);
        vetor.adicionar(16);
        vetor.adicionar(21);
        vetor.adicionar(27);
        vetor.adicionar(33);
        vetor.adicionar(42);
        vetor.adicionar(54);
        System.out.println("-----");
        lista.adicionarAoInicio(2);
        lista.adicionarAoInicio(7);
        lista.adicionarAoInicio(9);
        lista.adicionarAoInicio(12);
        lista.adicionarAoInicio(16);
        lista.adicionarAoInicio(21);
        lista.adicionarAoInicio(27);
        lista.adicionarAoInicio(33);
        lista.adicionarAoInicio(42);
        lista.adicionarAoInicio(54);
        System.out.println("-----");
        Iterador iterador = new Iterador(lista, lista.inicio);

        while (true) {
            System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Busca binária no vetor");
            System.out.println("2 - Adicionar ao início do vetor");
            System.out.println("3 - Adicionar ao final da lista");
            System.out.println("4 - Mostrar número de nós na lista");
            System.out.println("5 - Mostrar tamanho da lista");
            System.out.println("6 - Adicionar valor após um nó informado");
            System.out.println("7 - Inserir após o nó atual");
            System.out.println("8 - Remover após o nó atual");
            System.out.println("9 - Inserir antes do nó atual");
            System.out.println("10 - Remover antes do nó atual");
            System.out.println("0 - Sair");
        
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.print("Digite o valor para busca binária: ");
                int valorBusca = scanner.nextInt();
                vetor.buscabinaria(valorBusca);
                break;

            case 2:
                System.out.print("Digite o valor para adicionar ao início do vetor: ");
                int valorInicio = scanner.nextInt();
                vetor.adicionaraoinicio(valorInicio);
                vetor.mostrarElementos();
                break;

            case 3:
                System.out.print("Digite o valor para adicionar ao final da lista: ");
                int valorFinal = scanner.nextInt();
                lista.adicionaraofinal(valorFinal);
                lista.mostrarNos();
                break;

            case 4:
                lista.numeroNos();
                break;

            case 5:
                System.out.println("Tamanho da lista: " + lista.tamanho);
                break;

            case 6:
                System.out.print("Digite o valor a ser adicionado: ");
                int novoValor = scanner.nextInt();
                System.out.print("Digite o valor do nó após o qual será adicionado: ");
                int valorInformado = scanner.nextInt();
                lista.adicionarnovalor(novoValor, valorInformado);
                lista.mostrarNos();
                break;

            case 7:
                System.out.print("Digite o valor para inserir após o nó atual: ");
                int valorAposAtual = scanner.nextInt();
                iterador.inserirAposAtual(valorAposAtual);
                lista.mostrarNos();
                break;

            case 8:
                iterador.removerAposAtual();
                lista.mostrarNos();
                break;

            case 9:
                System.out.print("Digite o valor para inserir antes do nó atual: ");
                int valorAntesAtual = scanner.nextInt();
                iterador.inserirAntesAtual(valorAntesAtual);
                lista.mostrarNos();
                break;

            case 10:
                iterador.removerAntesAtual();
                lista.mostrarNos();
                break;

            case 0:
                System.out.println("Saindo...");
                scanner.close();
                return;

            default:
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}    
