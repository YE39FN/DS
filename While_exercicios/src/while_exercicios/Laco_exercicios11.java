
package while_exercicios;


public class Laco_exercicios11 { 
        public static int anosParaUltrapassar(double popA, double taxaA, double popB, double taxaB) 
        { int anos = 0; 
        while (popA <= popB) { 
        popA *= (1 + taxaA / 100); 
        popB *= (1 + taxaB / 100); 
        anos++; } 
        
        return anos; 
        } 
        
        public static void main(String[] args) { 
        double populacaoA = 80000; 
        double taxaA = 3; 
        double populacaoB = 200000; 
        double taxaB = 1.5; 
        
        int anos = anosParaUltrapassar(populacaoA, taxaA, populacaoB, taxaB); 
        System.out.println("O país A ultrapassará ou igualará o país B em " + anos + " anos."); 
        
        } 
}
   
