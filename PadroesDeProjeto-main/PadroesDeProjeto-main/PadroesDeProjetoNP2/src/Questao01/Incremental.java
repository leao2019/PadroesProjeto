/*
 */
package Questao01;

/**
 *
 * @author lucas leao
 */
public class Incremental {
    
    private static Incremental instanciaIncremental;
    
    private static int count = 0;
    private int numero;
    
    private Incremental(){
        numero = ++count;
    }
    
    public static synchronized Incremental getInstanciaIncremental() {
            if (instanciaIncremental == null){
                    instanciaIncremental = new Incremental();
            }
            return instanciaIncremental;
    }
    
    public String toString(){
        return "Incremental " + numero;
    }
    
}
