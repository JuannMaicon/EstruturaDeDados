package metodosDeOrdenacao;

public class BubbleSortTime {

    public static void main(String[] args) {
        int[] vetor = new int[100];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        //variavel que registra o tempo de execução no inicio 
        long inicio = System.currentTimeMillis();

        //metodo de ordenaçao bubbleSort
        int aux = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }

        //variavel que registra o tempo de execução no inicio 
        long fim = System.currentTimeMillis();

//exibir tempo de execução
        System.out.println("Tempo De Execução: " + (fim - inicio));
    }
}
