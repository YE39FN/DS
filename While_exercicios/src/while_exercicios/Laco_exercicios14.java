
package while_exercicios;


import java.util.Scanner;

public class Laco_exercicios14 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Não é possível calcular fatorial para números negativos");
        } else {
           
            long fatorial = 1;

            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + num + " é: " + fatorial);
        }
    }
}