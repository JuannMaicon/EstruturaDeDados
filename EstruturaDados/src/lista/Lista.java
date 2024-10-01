package lista;

public class Lista {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        
        lista.adiciona("Claudio");
        lista.adiciona("Camila");
        lista.adiciona("Miguel");
        lista.adiciona("Elis");
        
        System.out.println(lista);
        System.out.println("Tamanho Da Lista = "+lista.getTamanho());
        System.out.println("Inicio Da Lista = " +lista.getInicio().getElemento());
        System.out.println("Fim Lista = " + lista.getFim().getElemento());
        
        lista.remover("Claudio");
         
        System.out.println(lista);
        System.out.println("Tamanho Da Lista = "+lista.getTamanho());
        System.out.println("Inicio Da Lista = " +lista.getInicio().getElemento());
        System.out.println("Fim Lista = " + lista.getFim().getElemento());
        
       
    }
    
}
