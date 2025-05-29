/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetocarro;

/**
 *
 * @author pc
 */
public class ProjetoCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // instanciando a classe carro;
        
        Carro c1 = new Carro();
        c1.nome = "UNO";
        c1.marca = "FIAT";
        c1.ano = 2015;
        c1.vel = 120;
        
        
        Moto m1 = new Moto();
        m1.nomeM = "TuaMae";
        m1.marcaM = "Yamaha";
        m1.anoM = 2005;
        m1.velM = 70;
        
        Kombi k1 = new Kombi();
        k1.nomeK = "Filmore";
        k1.marcaK = "Volkswagen";
        k1.anoK = 2005;
        k1.velK = 70;
        
        
    }
    
       
    
}
