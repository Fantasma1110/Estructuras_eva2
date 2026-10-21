/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_listasimple;

/**
 *
 * @author orteg
 */
public class Nodo {
    //Dos Atributos
    private int valor;
    private Nodo siguiente;
    //Constructores

    public Nodo() {
        siguiente = null; //Esto es muy importante
    }

    
    public Nodo(int valor) {//Poner el valor a guardar, al momento de crear el nodo
        this.valor = valor;
        siguiente = null;
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
    
    
}
