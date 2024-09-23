package estruturadados;

public class testePìlha {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        // System.out.println("Dados da Pilha: " + pilha);
        // System.out.println("Qude de dados da pulha: " + pilha.tamanho());
        // System.out.println("A Pilha esta vazia: " + pilha.estaVazia());
        //pilha.adiciona(1);
        // System.out.println("Dados da Pilha: " + pilha);
        //System.out.println("Qude de dados da pulha: " + pilha.tamanho());
        //System.out.println("A Pilha esta vazia: " + pilha.estaVazia());
        pilha.Empilhar(1);
        pilha.Empilhar(2);
        pilha.Empilhar(3);

        System.out.println(pilha);
        System.out.println("Desempilhar elemento " + pilha.desempilhar());
        System.out.println(pilha);

    }

}
