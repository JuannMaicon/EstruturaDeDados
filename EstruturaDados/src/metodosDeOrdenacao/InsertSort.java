package metodosDeOrdenacao;

public class InsertSort {

    public static void main(String[] args) {

        // criando um vetor de numeros inteiros de 10 posiçoes
        int[] vetor = new int[10];

        // inserindo valores no vetor 
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);

//exibindo os valores do vetor
            System.out.println(vetor[i]);
        }

        //metodo de ordenaçao insertSort
        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + i] = vetor[j];
                j--;
            }
            vetor[j + i] = aux;
        }
        System.out.println("Vetor Ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
