import java.util.LinkedList;

public class HashTable {
    // Classe interna para armazenar chave e valor
    static class Entrada {
        String chave;
        String valor;

        Entrada(String chave, String valor) {
            this.chave = chave;
            this.valor = valor;
        }
    }

    private LinkedList<Entrada>[] tabela;
    private int tamanho;

     // Construtor
    public HashTable(int tamanho) {
        this.tamanho = tamanho;
        tabela = new LinkedList[tamanho];

        // Inicializa cada posição com uma lista
        for (int i = 0; i < tamanho; i++) {
            tabela[i] = new LinkedList<>();
        }
    }

    // Função hash simples
    private int hash(String chave) {
        return Math.abs(chave.hashCode() % tamanho);
    }

    // Inserir elemento
    public void inserir(String chave, String valor) {
        int indice = hash(chave);
        LinkedList<Entrada> lista = tabela[indice];

        // Verifica se a chave já existe (atualiza)
        for (Entrada e : lista) {
            if (e.chave.equals(chave)) {
                e.valor = valor;
                return;
            }
        }

        // Caso não exista, adiciona
        lista.add(new Entrada(chave, valor));
    }

    // Buscar elemento
    public String buscar(String chave) {
        int indice = hash(chave);
        LinkedList<Entrada> lista = tabela[indice];

        for (Entrada e : lista) {
            if (e.chave.equals(chave)) {
                return e.valor;
            }
        }

        return null; // não encontrado
    }

    // Remover elemento
    public void remover(String chave) {
        int indice = hash(chave);
        LinkedList<Entrada> lista = tabela[indice];

        lista.removeIf(e -> e.chave.equals(chave));
    }

    public static void main(String[] args) {
    HashTable tabela = new HashTable(7);

    tabela.inserir("Wagner", "1234");
    tabela.inserir("Isa", "5678");
    tabela.inserir("Yan", "9999");

    System.out.println("=== LISTAGEM DE CONTATOS ===");
    System.out.println("Wagner -> " + tabela.buscar("Wagner"));
    System.out.println("Isa -> " + tabela.buscar("Isa"));
    System.out.println("Yan -> " + tabela.buscar("Yan"));

    System.out.println("\n=== BUSCA ===");
    String nomeBusca = "Isa";
    System.out.println("Nome buscado: " + nomeBusca);
    System.out.println("Resultado: " + tabela.buscar(nomeBusca));

    System.out.println("\n=== REMOÇÃO ===");
    tabela.remover("Isa");
    System.out.println("Nome removido: Isa");

    System.out.println("\n=== BUSCA APÓS REMOÇÃO ===");
    System.out.println("Nome buscado: Isa");
    System.out.println("Resultado: " + tabela.buscar("Isa"));
}
}