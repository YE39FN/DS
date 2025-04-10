
package while_exercicios;

import java.util.Scanner;

public class While_exercicios3 {
public static void main(String[] args) {
            Scanner entrada = new Scanner (System.in);
             System.out.println("Digite o primeiro número do intervalo:  ");
            int numero1 = entrada.nextInt();
           
            System.out.println("Esses são so número ímpares, até o número que você digitou:  ");
           for (int contador = 1; contador <= numero1; contador=contador+2){
                System.out.println(contador);
           }
            
            System.out.println("Aqui estão os números pares, até o número que você digitou:  ");
           for (int contador2 = 0; contador2 <= numero1; contador2=contador2+2){
                System.out.println(contador2);
            }         
}
   
}
            

    

