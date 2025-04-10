
package while_exercicios;

import java.util.Scanner;


public class While_Exercicios5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
            int i = 1;
            int num2 = 0;
            int num1 = 0;

            while (i<= 10){
                System.out.println("Digite o  " + i + "° número da sequência:  ");
                int num = entrada.nextInt();
                
                for(int j = 0; j < 10; j++) {
                if(num > num1) {
                num2 = num1;
                num1 = num;
    }           else if(num > num2) {
                num2 = num;
    }
} 
                i=i+1;
                
            }
            System.out.println("Esses foram os maiores números da sequência:  " + ": " + num2);
    }
    
}
