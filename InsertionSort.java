import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // Vetor exemplo para ordenação:
        int vetor[] = {4, 6, 9, 1, 12, 3};
        int i, j, aux; // aux = variável auxiliar

        System.out.println("Vetor antes da ordenação:\n" + Arrays.toString(vetor));

        System.out.println("\nVetor durante a ordenação:");

        for(i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;

            // Move os maiores elementos para a esquerda:
            while(j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux; // Insere o elemento na posição correta

            // Imprimindo cada passo:
            System.out.println(Arrays.toString(vetor)); 
        }
        System.out.println("\nVetor após a ordenação:\n" + Arrays.toString(vetor));
    }
}