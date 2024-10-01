package lista;

public class ListaEncadeada<Tipo> {

    private No inicio;
    private No fim;
    private int tamanho;

    //Método Construtor//
    public ListaEncadeada() {

        this.tamanho = 0;
    }
    //Métodos De Acesso//
    public No getInicio() {
        return inicio;
    }

    public No getFim() {
        return fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    //Método De Exibição
    @Override
    public String toString() {
        return "ListaEncadeada{" + "inicio=" + inicio + "}";
    }
    //Método Para Adionar Elemento//
    public void adiciona (Tipo elemento){
        No<Tipo> celula = new No<Tipo>(elemento);
        if(this.inicio == null && this.fim == null){
            this.inicio = celula;
            this.fim = celula;
        }
        else{
            this.fim.setProximo(celula);
            this.fim = celula;
        }
        this.tamanho++;
    }
    //Método Para Buscar o Nó
    public No get(int posicao){
        No atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            if(atual.getProximo()!= null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }
    //Método Para Remover Nó//
    public void remover(Tipo elemento){
        No anterior = null;
        No atual = this.inicio;
        for (int i = 0; i < this.getTamanho(); i++) {
            if(atual.getElemento().equals(elemento)){
                anterior.setProximo(atual.getProximo());
                atual = null;
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

}
