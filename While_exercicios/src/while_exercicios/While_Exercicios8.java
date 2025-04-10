
package while_exercicios;

import java.util.Scanner;


public class While_Exercicios8 {
    
        public static void main(String[] args) {
                 Scanner entrada = new Scanner (System.in);
            
            
                System.out.println("Digite o tamanho do seu quadrado: ");
                int lado = entrada.nextInt();
                
                for(int contador = 1; contador <= lado; contador++){
                    System.out.print("*");
                }
                System.out.println("\r");
                for(int contador = 1; contador <= lado; contador++){
                    System.out.print("*");
                    for(int contador2 = 1; contador2 <= lado-2; contador2++){
                        System.out.print(" ");

                    }
                    System.out.print("*\n");
                }
                
                
                for(int contador = 1; contador <= lado; contador++){
                    System.out.print("*");
                }
               
        }

}