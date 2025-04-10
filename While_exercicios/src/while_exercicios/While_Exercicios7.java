
package while_exercicios;

import java.util.Scanner;


public class While_Exercicios7 {
    
        public static void main(String[] args) {
                 Scanner entrada = new Scanner (System.in);
            
            
                System.out.println("Digite o tamanho do seu quadrado: ");
                int lado = entrada.nextInt();
                
                for(int contador = 1; contador <= lado; contador++){
                    System.out.print("*");
                }
                System.out.println("\r");
                for(int contador = 1; contador <= lado; contador++){
                    System.out.println("*****");
                }
                
                
                for(int contador = 1; contador <= lado; contador++){
                    System.out.print("*");
                }
               
        }

}
    

