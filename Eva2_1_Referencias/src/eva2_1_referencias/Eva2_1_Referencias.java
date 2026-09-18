/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_referencias;

/**
 *
 * @author orteg
 */
public class Eva2_1_Referencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejemplo inicio = new Ejemplo();
        inicio.valor = 100;
        
        System.out.println("inicio " + inicio);
        System.out.println("inicio.valor " + inicio.valor);
        System.out.println("inicio.otro " + inicio.otro);
        //Crea una lista
        inicio.otro = new Ejemplo();
        inicio.otro.valor = 200;//segundo objeto
        
        inicio.otro.otro = new Ejemplo();
        inicio.otro.otro.valor = 300;
        
        inicio.otro.otro.otro= new Ejemplo();
        inicio.otro.otro.otro.valor = 400;
        
        
        Ejemplo sig = inicio;
        while (sig != null) {            
            System.out.print("[" + sig.valor + "]");
            sig = sig.otro;
        }
        
    }
    
}
class Ejemplo{
    int valor;
    Ejemplo otro;
}