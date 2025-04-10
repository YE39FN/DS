
package while_exercicios;

import java.util.Scanner;


public class Laco_exercicios7 {
    
        public static void main(String[] args) {
            int i = 1;
            Scanner entrada = new Scanner (System.in);
            System.out.println("Escreva um número:  ");
            int num = entrada.nextInt();
            
        while (i <= num){
            System.out.println(i);
            i++;
            
            
        }
        
        if(num < 0){
                System.out.println("Valor Inválido!");
        }
        
        
        

        }

    
}
