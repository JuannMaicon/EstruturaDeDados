package metodosDeOrdenacao;

public class SelectionSort {

    public static void main(String[] args) {

        // criando um vetor de numeros inteiros de 10 posiçoes
        int[] vetor = new int[2000];

        // inserindo valores no vetor 
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);

//exibindo os valores do vetor
            System.out.println(vetor[i]);
        }
        // metodo de ordenação selectionSort
        int menorPosicao, aux;
        for (int i = 0; i < vetor.length; i++) {
            menorPosicao = i;
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] < vetor[menorPosicao]) {
                    menorPosicao = j;

                }}
                aux = vetor[menorPosicao];
                vetor[menorPosicao] = vetor[i];
                vetor[i] = aux;
            }
            System.out.println("Vetor Ordenado: ");
            for (int i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
            

        }
    }

}
