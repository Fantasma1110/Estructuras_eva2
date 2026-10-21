package eva2_2_listasimple;

public class Lista {//Lista simple
    private Nodo inicio;
    private Nodo fin;
    
    public Lista(){
        inicio = null;//al crear la lista, se cra vacia
        fin = null;
    }
    //SIEMPRE DE AGREGAN AL FINAL DE LA LISTA
    //O(N) --> se agrega al final
    //Vercion mejorada O(1) --> con nodo fin, ya no se recorren todos
    public void agregar(int valor){
       Nodo nuevo = new Nodo(valor);//creo el nodo para el valor a insertar
       
       if(inicio == null){//lista vacia
           inicio = nuevo;//nuevo es el primer nodo de la lista 
           fin = inicio;
       }else{//la lista no esta vacia
           //movemos al final
           /*Nodo temp = inicio;
           while(temp.getSiguiente() !=null){
               temp = temp.getSiguiente();
           }
           temp.setSiguiente(nuevo);//conecto nuevo al final de la lista*/
           fin.setSiguiente(nuevo);
           fin = nuevo;
           tam++;
           
       }
    
    }
    //O(N)
    public void imprimir(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.println("[ "+ temp.getValor()+ " ]");
            temp = temp.getSiguiente()   ;
        }
    }
    
    /*O(N)
    public int longitud(){
        int cont = 0;
        Nodo temp = inicio;
        while(temp != null){
            cont ++;
            temp = temp.getSiguiente();
        }
        return cont;
        }
    */
    //O(1)
    
   private int tam = 0;

public int longitud() { return tam; }
    
    
    
    
    //O(N)
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
    
    //VALIDAR posicion tenga un vlo valido
                    //throws
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
    //regresa a primera aparicion del valor de la lista
    //O()
    public int encontrar (int valor){
        Nodo temp = inicio;
        int posicion = 0;
        
        while(temp !=null){
            if(valor == temp.getValor()){
                System.out.println("la posicion de el valor "+valor +  " en el arreglo es: "+posicion);
                return posicion;
            }
            temp = temp.getSiguiente();
            posicion ++;
        } 
        System.out.println("el valor de la lista no existe");
        return -1;
    }
    
    //O(N) --> hay que recorrer hasta la posicion
    public void insertarEn(int posicion, int valor) throws RuntimeException {
    int tama = longitud();
    //para insertar, la posicion puede ser de 0 a N (N = al final)
    if (posicion < 0 || posicion > tama) {
        throw new RuntimeException("la posicion es invalida: " + posicion);
    }

    Nodo nuevo = new Nodo(valor);

    if (posicion == 0) {//insertar al inicio
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
        if (fin == null) {//la lista estaba vacia
            fin = nuevo;
        }
    } else if (posicion == tama) {//insertar al final
        fin.setSiguiente(nuevo);
        fin = nuevo;
    } else {//insertar en medio
        Nodo temp = inicio;
        //nos paramos en el nodo ANTERIOR a la posicion
        for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getSiguiente();
        }
        nuevo.setSiguiente(temp.getSiguiente());//primero conectamos nuevo con el resto
        temp.setSiguiente(nuevo);//luego el anterior apunta a nuevo
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
    } else {
        Nodo temp = inicio;
        for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getSiguiente();
        }
        borrar = temp.getSiguiente();
        temp.setSiguiente(borrar.getSiguiente());
        if (borrar == fin) fin = temp;
        tam--;
    }

    if (inicio == null) fin = null;
    return borrar.getValor();
}
    // O(n2)
    public void invImprimir(){
        for (int i = longitud()-1 ; i >= 0; i--) {
            System.out.println("longitud inversa "+valorEn(i)+"");
        }
    }
    
    
    }