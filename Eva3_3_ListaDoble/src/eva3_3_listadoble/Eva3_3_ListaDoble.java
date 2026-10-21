
    public static void main(String[] args) {
        Lista_Doble lista = new Lista_Doble();
        
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        
        lista.imprimir();
        System.out.println("---------------------------------");
        lista.invImprimir();
        
         System.out.println("---------------------------------");
        lista.insertarEn(3, 1500);
        
        lista.imprimir();
         System.out.println("---------------------------------");
        lista.invImprimir();
                
    }
    

