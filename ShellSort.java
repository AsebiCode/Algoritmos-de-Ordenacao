import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int vetor[] = {5, 8, 1, 3, 7, 2, 4, 6};
        int tamanhoVetor = vetor.length;

        // aux = variável auxiliar
        // gap = distância entre os elementos a serem comparados
        int gap, i, j, aux;

        System.out.println("Vetor antes da ordenação:\n" + Arrays.toString(vetor));

        System.out.println("\nVetor durante a ordenação:");


        for (gap = tamanhoVetor / 2; gap > 0; gap /= 2) {
            for (i = gap; i < tamanhoVetor; i++) {
                aux = vetor[i];
                j = i;

                // Move os elementos maiores que aux para a direita
                while (j >= gap && vetor[j - gap] > aux) {
                    vetor[j] = vetor[j - gap];
                    j -= gap;
                }
                vetor[j] = aux; // Inserindo na posição correta

                // Imprimindo cada passo:
                System.out.println(Arrays.toString(vetor)); 
            }
        }

        System.out.println("\nVetor após a ordenação:\n" + Arrays.toString(vetor));
    }
}