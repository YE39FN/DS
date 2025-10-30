package lista_exercicios_java;
import java.util.Scanner;
public class ex_3 {
    
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o seu saldo aqui: ");
        double saldo = scanner.nextDouble();
        
        double saldo_final = saldo * 0.01;
        
        System.out.println("Esse é o seu saldo final:  ");
    }
    
}
