
package estruturadados;


public class Fila<T> extends EstruturaEstatica<T> {
    public Fila(){
        super();
    }
    public Fila(int capacidade){
        super(capacidade);
    }
    public void enfileira(T elemento){
        this.aumentaCapacidade();
        this.elementos[this.tamanho]= elemento;
        this.tamanho++;
        
        //vamos aproveitar o codigo que ja existe
        this.adiciona(elemento);
        
    }
    public T espiar(){
        if(this.estaVazia()){
            return null;
        }
        return this.elementos[0];
    }
    public T desenfileira(){
        if (this.estaVazia()) {
            return null;
        }
        //ja temos um metodo para remover na classe pai porem precisa indicar
        // a posição e para isso vamos criar uma constanter
        final int pos = 0;
         T elementoASerRemovido = this.elementos[pos];
         this.remove(pos);
        return elementoASerRemovido;
    }
}
