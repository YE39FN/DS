
package while_exercicios;

import java.util.Scanner;


public class Laco_exercicios {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe o primeiro valor:  ");
        double valor1 = entrada.nextDouble();
        
        System.out.println("Informe o segundo valor:  ");
        double valor2 = entrada.nextDouble();
        
        while (valor2 == 0){
            System.out.println("O segundo valor não poderá ser zero. Por favor, digite outro número:  ");
            valor2 = entrada.nextDouble();
        }
        
        double divisao = valor1 / valor2;
        
        System.out.println("Esse é o resultado da divisão entre o valor 1 (" + valor1 + ") e o valor 2 (" + valor2 + "):  " + divisao);
        
    }
    
}

