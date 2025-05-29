
package projetocarro;

public class Moto {
    
    String nomeM;
    String marcaM;
    int anoM;
    int velM;
    
    void acelerarM(int aceleracao){
        velM+=aceleracao;
    }
    
    void freiarM(int reduzir){
        velM-=reduzir;
    }
    
    void buzinarM(){
        System.out.println("Moto Buzinando!");
    }
    void derraparM(){
        System.out.println("Moto Derrapando!");
    }
    void atropelarcadeiranteM(){
        System.out.println("Você atropelou um cadeirante que nem sabia piscar!");
    }
        
    }
