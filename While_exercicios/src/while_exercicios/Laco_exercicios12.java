
package while_exercicios;

import java.util.Scanner;


public class Laco_exercicios12 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        
        System.out.print("Digite o número de termos da sequência: ");
        int num = entrada.nextInt();

        
        if (num <= 0) {
            System.out.println("O número precisa ser positivo! Insira um número positivo e tente novamente.");
        } else {
            
            int a = 1, b = 1;

           
            System.out.print("Sequência de Fibonacci: ");
            if (num == 1) {
                System.out.println(a);
            } else {
                
                System.out.print(a + " " + b + " ");
                
                
                for (int i = 3; i <= num; i++) {
                    int c = a + b; 
                    System.out.print(c + " ");
                    a = b; 
                    b = c; 
                }
                System.out.println();
            }
        }

       
    }
}

    

