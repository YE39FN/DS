package lista_exercicios_java;

import java.util.Scanner;
public class ex_4 {
    
    public static void main(String [] args){
        
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite a porcentagem do IPI: ");
        double ipi = scanner.nextDouble();
        
        System.out.print("Digite o código da peça 1: ");
        int cod_peca1 = scanner.nextInt();
        
        System.out.print("Digite o valor unitário da peça 1: ");
        double val_peca1 = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de peças 1: ");
        int quant_peca1 = scanner.nextInt();
        
        System.out.print("Digite o código da peça 2: ");
        int cod_peca2 = scanner.nextInt();
        
        System.out.print("Digite o valor unitário da peça 2: ");
        double val_peca2 = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de peças 2: ");
        int quant_peca2 = scanner.nextInt();
        
        // Calculando o valor total com o IPI
        double total = (val_peca1 * quant_peca1 + val_peca2 * quant_peca2) * (ipi / 100 + 1);
        
        System.out.println("Valor total a ser pago: R$ " + total);
        
        scanner.close();
    }
    
}
