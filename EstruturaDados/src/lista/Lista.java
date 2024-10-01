package lista;

public class Lista {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        System.out.println("Tamanho Da Lista = "+lista.getTamanho());
        lista.adiciona("Claudio");
        
        System.out.println(lista);
        System.out.println("Tamanho Da Lista = "+lista.getTamanho());
        System.out.println("Inicio Da Lista = " +lista.getInicio().getElemento());
        System.out.println("Fim Lista = " + lista.getFim().getElemento());
        
        lista.adiciona("Camila");
         
        System.out.println(lista);
        System.out.println("Tamanho Da Lista = "+lista.getTamanho());
        System.out.println("Inicio Da Lista = " +lista.getInicio().getElemento());
        System.out.println("Fim Lista = " + lista.getFim().getElemento());
        
        System.out.println("Elemento Na Posição 2 = "+ lista.get(2).getElemento());
    }
    
}
