package while_exercicios;

import java.util.Scanner;


public class Laco_exercicios3 {
    
        public static void main(String[] args) {
           
           Scanner entrada = new Scanner (System.in);
           System.out.println("Informe a primeira nota do aluno:  ");
           double nota1 = entrada.nextDouble();
            
           System.out.println("Informe a segunda nota do aluno:  ");
           double nota2 = entrada.nextDouble();
          
           if (nota1 >=0 && nota2 >= 0 && nota1 <= 10 && nota2 <= 10){
               double media = (nota1 + nota2) / 2.0;
               System.out.println("Essa é a média das notas do aluno digitadas por você:  " + media);
           }
           
           while(nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10) {
               
               
                System.out.println("Esse valor não é válido!");
                System.out.println("NOVO CÁLCULO? (DIGITE 'S' PARA SIM, E 'N' PARA NÃO)  ");
                String resposta = entrada.next();
                
                if(resposta.equals('S')){
                    nota1 = entrada.nextDouble();
                }
                else if(resposta.equals('N')){
                    break;
                }
        }

        }

    
}