/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_listasimple;

/**
 *
 * @author orteg
 */
public class Eva2_2_ListaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
     /* int [] arreglo = new int [1000000];
        long ini,fin,tiempo;
        ini = System.nanoTime();//Tomamos la "hora" antes de empezar
        
        for (int i = 0; i < 1000000; i++) {
            lista.agregar((int)(Math.random()*100));
        }
        
        fin = System.nanoTime();//Tomamos la "Hora "despues de realizar el ´proceso
        tiempo = fin-ini;
        System.out.println("Tiempo " + tiempo);
        
        System.out.println();*/
        System.out.println("Tamaño de lista: "+ lista.longitud());
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.imprimir();
        System.out.println("Tamaño de lista: "+ lista.longitud());
   
       
        lista.imprimir();
        System.out.println("Tamaño de lista: "+ lista.longitud());

        lista.borrarEn(0);
        lista.imprimir();
        System.out.println(lista.longitud());
        
        lista.invImprimir();
    }
    
}
