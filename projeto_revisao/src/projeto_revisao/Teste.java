package projeto_revisao;

public class Teste {

	public static void main(String[] args)throws Exception {
		Vetor vetor = new Vetor(50);
	
		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
		vetor.adiciona("Elemento 3");
		vetor.adiciona("Elemento 4");
		vetor.adiciona("Elemento 5");
		
	System.out.println("A quantidade de informações no vetor é: " + vetor.tamanho());
	System.out.println("Dados do vetor"+vetor.toString());
	System.out.println("Informação na posicão: " + vetor.busca(1));
	System.out.println("________________________________________");
vetor.adicionarInicio(0, "Elemento 0 ");
	System.out.println("A quantidade de informações no vetor é: " + vetor.tamanho());
	System.out.println("Informação na posicão: " + vetor.busca(10));
	
	}

}
