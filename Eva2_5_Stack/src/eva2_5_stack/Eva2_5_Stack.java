/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_stack;

/**
 *
 * @author orteg
 */
public class Eva2_5_Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack Stack = new MyStack();
        
        Stack.push(100);
        Stack.push(200);
        Stack.push(300);
        Stack.push(400);
        Stack.push(500);
        
        Stack.peek();
        Stack.imprimir();
        
        System.out.println("------------------------");
        
        Stack.pop();
        Stack.pop();
        Stack.imprimir();
        
        System.out.println("-------------------------");
        
        Stack.push(999);
        Stack.imprimir();
    }
    
}
