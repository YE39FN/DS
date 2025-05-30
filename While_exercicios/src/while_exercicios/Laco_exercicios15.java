
package while_exercicios;

    
    import java.util.Scanner;

public class Laco_exercicios15 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Escreva a quantidade de números: ");
        int num = scanner.nextInt();

        
        if (num <= 0) {
            System.out.println("A Quantidade de números precisa ser maior que 0! Insira novamente a quantidade:  ");
        } else {
            
            int menorValor = Integer.MAX_VALUE;
            int maiorValor = Integer.MIN_VALUE;
            int soma = 0;

            
            for (int i = 1; i <= num; i++) {
                System.out.print("Digite o " + i + "º número: ");
                int numero = scanner.nextInt();

                
                if (numero < menorValor) {
                    menorValor = numero;
                }
                if (numero > maiorValor) {
                    maiorValor = numero;
                }
                soma += numero;
            }

           
            System.out.println("O menor valor é: " + menorValor);
            System.out.println("O maior valor é: " + maiorValor);
            System.out.println("A soma dos valores é: " + soma);
        }
    }
}
