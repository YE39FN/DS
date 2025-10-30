package lista_exercicios_java;
import java.util.Scanner;

public class ex_1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a sua idade em anos: ");
        int idd_anos = scanner.nextInt();
        
        System.out.print("Digite a sua idade em meses: ");
        int idd_meses = scanner.nextInt();
        
        System.out.print("Digite a sua idade em dias: ");
        int idd_dias = scanner.nextInt();
        
        int totaldias = (idd_anos * 365) + (idd_meses * 30) + idd_dias;
        
        System.out.println("A sua idade em dias é: " + totaldias);
        
        scanner.close();

    }
    
}
