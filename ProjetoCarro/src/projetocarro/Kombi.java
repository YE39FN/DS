package projetocarro;

public class Kombi {
    String  nomeK;
    String  marcaK;
    int anoK;
    int velK;
    
    //métodos
    void acelerarK(int aceleracao){
        velK+=aceleracao;
    }
    
    void freiarK(int reduzir){
        velK-=reduzir;
    }
    
    void buzinarK(){
        System.out.println("Kombi Buzinando!");
    }
    void tomarumaK(){
        System.out.println("Vamo tomar uma!");
        }
    void descerK(int aceleracao){
        velK+=aceleracao;
        System.out.println("Ele vai descer lá pra BC!");
    }
    }

