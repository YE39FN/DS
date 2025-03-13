
package exercicios_ds;


public class exercicio13_java {
    
    public static void main(String[] args) {
        int lv = 34;
        var tc = "G";
         if (tc.equals("G")){
            if(lv<=20){
               double desconto = 0.04 * 3.30;
               double vpc = 3.30 - desconto;
               double vt = vpc * lv;
               
               System.out.println("Esse será seu valor a pagar com o tipo de combustível " + tc + ": " + "R$ " + vt);
            }
            
            else if(lv>20){
                double desconto2 = 0.06 * 3.30;
               double vpc2 = 3.30 - desconto2;
               double vt2 = vpc2 * lv;
               
               System.out.println("Esse será seu valor a pagar com o tipo de combustível " + tc + ": " + "R$ " + vt2);
            }
        }
    }
    }
