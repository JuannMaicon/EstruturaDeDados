package estruturadados;

public class Lista<T> extends EstruturaEstatica<T> {

    //método construtor com parametros o super proque esta herdando//
    public Lista(int capacidade){
        super(capacidade);
    }
    
    //método construtor sem parametros
    public Lista(){
        super();
    }
    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento){
        return super.adiciona(posicao, elemento);
    }
}

  
