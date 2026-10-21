/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author orteg
 */
public class Eva2_4_Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyQueue Queue = new MyQueue();
        
        Queue.push(100);
        Queue.push(200);
        Queue.push(300);
        Queue.push(400);
        Queue.push(500);
        
        Queue.peek();
        Queue.imprimir();
        
        System.out.println("-------------------------------");
        
        Queue.pop();
        Queue.pop();
        Queue.pop();
        Queue.imprimir();
        
        System.out.println("----------------------------------");
        
        Queue.push(999);
        Queue.peek();
        Queue.imprimir();
    }
    
}
