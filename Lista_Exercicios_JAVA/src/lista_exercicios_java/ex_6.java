
package lista_exercicios_java;

import java.util.Scanner;
public class ex_6 {
    
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite um número a seguir:  ");
        int num = scanner.nextInt();
        
        int antecessor = num - 1;
        int sucessor = num + 1;
        
        System.out.println("O antecessor do seu número é:  ");
        System.out.println("O sucessor do seu número é:  ");

    }
    
}
