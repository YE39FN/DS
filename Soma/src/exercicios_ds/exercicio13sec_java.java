
package exercicios_ds;


public class exercicio13sec_java {
    
    public static void main(String[] args) {
        int lv = 8;
        var tc = "A";  
        
        
        if (tc.equals("A")){
            if(lv<=20){
               double desconto = 0.03 * 2.90;
               double vpc = 2.90 - desconto;
               double vt = vpc * lv;
               
               System.out.println("Esse será seu valor a pagar com o tipo de combustível " + tc + ": " + "R$ " + vt);
            }
            
            else if(lv>20){
                double desconto2 = 0.05 * 2.90;
               double vpc2 = 2.90 - desconto2;
               double vt2 = vpc2 * lv;
               
               System.out.println("Esse será seu valor a pagar com o tipo de combustível " + tc + ": " + "R$ " + vt2);
            }
        }
    }
}
