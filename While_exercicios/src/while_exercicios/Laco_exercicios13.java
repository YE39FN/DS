
package while_exercicios;

import java.util.Scanner;


public class Laco_exercicios13 {
    public static void main(String[] args) {
        
        int a = 0, b = 1;
        
        System.out.print("Sequência de Fibonacci: " + a + " " + b + " ");

        
        while (true) {
            int c = a + b;  
            if (c > 500) {
                break;  
            }
            System.out.print(c + " ");
            a = b;  
            b = c;  
        }

        System.out.println();  
    }
}
      
