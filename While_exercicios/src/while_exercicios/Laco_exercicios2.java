
package while_exercicios;

import java.util.Scanner;


public class Laco_exercicios2 {
    
        public static void main(String[] args) {
           
           Scanner entrada = new Scanner (System.in);
           System.out.println("Informe a primeira nota do aluno:  ");
           double nota1 = entrada.nextDouble();
            
           System.out.println("Informe a segunda nota do aluno:  ");
           double nota2 = entrada.nextDouble();
           
           if (nota1 >=0 && nota2 >= 0 && nota1 <= 10 && nota2 <= 10){
               double media = nota1 + nota2 / 2;
               System.out.println("Essa é a média das notas do aluno digitadas por você:  " + media);
           }
           
           else {
                System.out.println("Esse valor não é válido!");
        }

        }

    
}
