/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_stack;

/**
 *
 * @author orteg
 */
public class MyStack {
         private Nodo inicio;
    private Nodo fin;
    private int tam;
    
    public void MyStack(){
        inicio = null;
        fin = null;
        tam = 0;
    }
    public void agregar(int valor){
       Nodo nuevo = new Nodo(valor);//creo el nodo para el valor a insertar
       
       if(inicio == null){//lista vacia
           inicio = nuevo;//nuevo es el primer nodo de la lista 
           fin = inicio;
       }else{//la lista no esta vacia
           fin.setSiguiente(nuevo);
           //conectar previo
           nuevo.setPrevio(fin);
           fin = nuevo;
           tam++;
       }
    
    }
      public void imprimir(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.println("[ "+ temp.getValor()+ " ]");
            temp = temp.getSiguiente()   ;
        }
    }
      public void insertarEn(int posicion, int valor) throws RuntimeException {
    int tama = longitud();
    //para insertar, la posicion puede ser de 0 a N (N = al final)
    if (posicion < 0 || posicion > tama) {
        throw new RuntimeException("la posicion es invalida: " + posicion);
    }

    Nodo nuevo = new Nodo(valor);

           //al inicio
           /* nuevo.sig = inicio
           //inicio.prev = nuevo
           inicio = nuevo
           */
           
    if (posicion == 0) {//insertar al inicio
        nuevo.setSiguiente(inicio);
        inicio.setPrevio(nuevo);
        inicio = nuevo;
        if (fin == null) {//la lista estaba vacia
            fin = nuevo;
        }
    } else if (posicion == tama) {//insertar al final
        fin.setSiguiente(nuevo);
        fin = nuevo;
    } else {//insertar en medio
        Nodo temp = inicio;
           //mitad de la lista
           /*
           nuevo.sig = temp
           nuevo.prev = temp.prev
           temp.prev.sig = nuevo
           temp.prev = nuevo
           */
        //nos paramos en el nodo ANTERIOR a la posicion
        for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getSiguiente();
        }
        nuevo.setSiguiente(temp);//primero conectamos nuevo con el resto
        nuevo.setPrevio(temp.getPrevio());
        temp.getPrevio().setSiguiente(nuevo);
        temp.setPrevio(nuevo);//luego el anterior apunta a nuevo
        
        
        tam++;


    }
    }
      //O(N) --> hay que recorrer hasta la posicion
   public int borrarEn(int posicion) throws RuntimeException {
    if (posicion < 0 || posicion >= longitud()) {
        throw new RuntimeException("la posicion es invalida: " + posicion);
    }

    Nodo borrar;
    if (posicion == 0) {
        borrar = inicio;
        inicio = inicio.getSiguiente();
        if (inicio != null) inicio.setPrevio(null);
    } else {
        Nodo temp = inicio;
        for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getSiguiente();
        }
        borrar = temp.getSiguiente();
        temp.setSiguiente(borrar.getSiguiente());
        if (borrar.getSiguiente() != null) borrar.getSiguiente().setPrevio(temp);
        if (borrar == fin) fin = temp;
    }

    tam--;
    if (inicio == null)
        fin = null;
    return borrar.getValor();
}
   public int valorEn(int posicion) throws RuntimeException {
        int tama = longitud();
        if (posicion >= 0 && posicion<tama){
            Nodo temp = inicio;
            //1 que posiciones son validas ? de 0 a N-1 es la cantidad de nodos
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
           }
            return temp.getValor();
        }else{
            throw  new RuntimeException("la posicion es invalida: "+posicion);
        }
    }

      public void invImprimir(){
          Nodo temp = fin;
          while (temp != null) {
              System.out.println("[ "+ temp.getValor()+ " ]");
              temp = temp.getPrevio();
          }
      }
      
     public int longitud(){
        int cont = 0;
        Nodo temp = inicio;
        while(temp != null){
            cont ++;
            temp = temp.getSiguiente();
        }
        return cont;
        }
        public boolean listaVacia(){
        if(inicio == null){
            System.out.println("La lista esta vacia");
            return true;
        }else {
            return false;
        }
    }
    public void vaciarLista(){
        inicio = null;
        fin = null;
        tam = 0;
    }
    public void push(int valor) {
    agregar(valor);   // mete al final
}

public int peek() {
    if (tam == 0) throw new RuntimeException("la pila esta vacia");
    return valorEn(tam);
}

public int pop() {
    if (tam == 0) throw new RuntimeException("la pila esta vacia");
    return borrarEn(tam);
}
}
