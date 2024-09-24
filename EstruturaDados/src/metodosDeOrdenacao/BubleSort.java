package metodosDeOrdenacao;


public class BubleSort {
    public static void main(String[] args) {
     // criando um vetor de numeros inteiros de 10 posiçoes
     int [] vetor = new int [10];
     
     // inserindo valores no vetor 
        for (int i = 0; i <vetor.length; i++) {
            vetor[i]= (int)(Math.random()* vetor.length);
            
            //exibindo os valores do vetor
            System.out.println(vetor[i]);
            
        }
    }
}
