/*
 1)Com base no código abaixo, re-escreva-o de modo que a classe Incremental 
obedeça ao padrão de Projeto Singleton. OBS: Tanto o código de implementação da 
classe Incremental quanto o código da classe de testes podem precisar sofrer 
alterações. OBS: Como resposta forneça o link no github para a solução deste item.
 */
package Questao01;

/**
 *
 * @author Lucas Leao
 */
public class TesteIncremental {
    
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            Incremental inc = Incremental.getInstanciaIncremental();
            System.out.println(inc);
        }
    }
    
}
