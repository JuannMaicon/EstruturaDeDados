package exemplo_array;

import java.util.ArrayList;

public class Exemplo_Array {
	public static void main(String[] args) {
		ArrayList<String> vetor = new ArrayList<String>();
		
		vetor.add("Claudio");
		vetor.add("Miguel");
		vetor.add("Jubileu");
		
		System.out.println("Quantidade de informações no vetor: "+ vetor.size());
		
		System.out.println("Dados do vetor"+ vetor.toString());
	}

}
