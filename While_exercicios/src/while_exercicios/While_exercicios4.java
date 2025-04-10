
package while_exercicios;

import java.util.Scanner;


public class While_exercicios4 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner (System.in);
            int i = 1;
            double soma = 0;

            System.out.println("Quantos alunos a sala possui?  ");
            int num_alunos = entrada.nextInt();
            
            
            while(i <= num_alunos){
                System.out.println("Digite a primeira nota do aluno:  ");
            double nota1 = entrada.nextDouble();
            System.out.println("Digite a segunda nota do aluno:  ");
            double nota2 = entrada.nextDouble();
            System.out.println("Digite a terceira nota do aluno:  ");
            double nota3 = entrada.nextDouble();
            System.out.println("Digite a quarta nota do aluno:  ");
            double nota4 = entrada.nextDouble();
            
            double soma_nota = nota1+ nota2 + nota3 + nota4;
            soma = soma + soma_nota;
            
            i=i+1;
            }
            double media = soma / (4*num_alunos);
            System.out.println("Essa será a média das notas do aluno dessa sala:  " + media);
            
            
            
            
            
        }
}
