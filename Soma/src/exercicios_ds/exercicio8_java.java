
package exercicios_ds;


public class exercicio8_java {
    
     public static void main(String[] args) {
    int el = 3000;
    int vb = 1000;
    int vn = 1000;
    int vv = 1000;
    double perb = (vb / el) * 100;
    double pern = (vn / el) * 100;
    double perv = (vv / el ) * 100;
    
    System.out.println("Esse será o percentual de votos brancos em relação ao total de eleitores:  " + perb);
    System.out.println("Esse será o percentual de votos votos nulos em relação ao total de eleitores:  " + pern);
    System.out.println("Esse será o percentual de votos votos nulos em relação ao total de eleitores:  " + perv);
    
    // A conta está certa, porém, o programa está dando o valor '0.0'
}   
}
