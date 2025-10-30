
package lista_exercicios_java;
import java.util.Scanner;

public class ex_2 {
    
    public static void main(String [] args){
        
        int media1 = 8+9+7/3;
        int media2 = 4+5+6/3;
        int media3 = media1+media2;
        int media4 = media1+media2/2;
        
        System.out.println("Essa é a média dos números 8, 9 e 7: " + media1);
        System.out.println("Essa é a média dos números 4, 5 e 6: " + media2);
        System.out.println("Essa é a soma das duas médias: " + media3);
        System.out.println("Essa é a média das duas médias: " + media4);
    }
}
