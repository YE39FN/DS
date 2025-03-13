
package exercicios_ds;


public class exercicio10_java {
    
        public static void main(String[] args) {
            int csf = 70000;
            double pord = 0.28;
            double pori = 0.45;
            double csfn = csf + (csf * pord) + (csf / pori);
            
            System.out.println("Esse será o custo final do consumidor:  " + "R$  " + csfn);
            
        }

    
}
