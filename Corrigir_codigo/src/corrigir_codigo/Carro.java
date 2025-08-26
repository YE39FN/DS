
package corrigir_codigo;


public class Carro {
    
    public static void main (String[] args){
        Corrigir_codigo Carro = new Corrigir_codigo();
        
        Carro.setPrecos(400.00, 50.00, 100.00);
        System.out.println("menor preço:");
        System.out.println( Carro.calcularMenorPreco() );
        System.out.println("maior preço:");
        System.out.println( Carro.calcularMaiorPreco() );
    }
    
}
