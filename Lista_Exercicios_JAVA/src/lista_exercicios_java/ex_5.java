
package lista_exercicios_java;

import java.util.Scanner;
public class ex_5 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        final double salario_minimo = 788.00;
        
        System.out.print("Digite o seu salário: ");
        double salario_usuario = scanner.nextDouble();
        
        double quant_salarios = salario_usuario / salario_minimo;
        
        System.out.println("Você ganha " + quant_salarios + " salários mínimos!");
        
        scanner.close();
    }
    
}
