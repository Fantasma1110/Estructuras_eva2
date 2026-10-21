
public class Nodo {
    //Dos Atributos
    private int valor;
    private Nodo siguiente;
    private Nodo previo;
    //Constructores

    public Nodo() {
        this.siguiente = null; //Esto es muy importante
        this.previo = null;
    }

    
    public Nodo(int valor) {//Poner el valor a guardar, al momento de crear el nodo
        this.valor = valor;
        this.siguiente = null;
        this.previo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
    
    
}
