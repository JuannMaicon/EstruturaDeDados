package estruturadados;

public class TesteFila {
    public static void main(String[] args) {
        
        Fila<Integer> fila = new Fila<>();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3); 
    
    //Vamos verificar se a fila esta vazia, nesse caso sera false
        System.out.println("A fila está vazia? "+fila.estaVazia());
        
        //Vamos verificar o tamamnho da minha fila apó a enfileirar 
        System.out.println("Qual o tamamnho da fila: " +fila.tamanho());
        
        //Vamos vizualizar os elementos dentro da fila 
        System.out.println(fila.toString());
        
        //Vamos espiar a fila
        System.out.println(fila.espiar());
        //poderiamos criar uma estrutura de decisão com o retorno do metodo
        if (fila.espiar() == null) {
            System.out.println("Ninguem na fila");            
        }else{
            System.out.println("O elemento da primeira posição é "+ fila.espiar());
        }
        System.out.println(fila.desenfileira());
    
}
}