/*
2)Suponha que você está implementando o sistema de uma estação meteorológica brasileira, cuja medida utilizada para temperatura é Celsius. Este sistema precisamedir a temperatura ambiente como pré-requisito para o processo de previsão do tempo. 
Esta empresa, por ser pública, precisou realizar processo licitatório para a aquisição de um equipamento de medição da temperatura. No entanto, os elaboradores do Termo de Referência da licitação não especificaram corretamente que o produto licitado deveria 
medir a temperatura em Celsius. Neste sentido, a empresa vencedora (cooporation.stark.com) forneceu um equipamento que mede temperaturas em Farenheit que possui uma biblioteca em Java
que apresenta um método chamado getTemperaturaFarenheit e que o código fonte desta biblioteca 
não foi fornecido. Uma das Interfaces do sistema, em desenvolvimento pela empresa de meteorologia, é a MedidorCelciusIF,  cujo método medirTemperatura() retorna sempre um valor double referente à temperatura na medida Celsius. 
Como mostrado abaixo:
a)	Qual seria o padrão de projeto sugerido pelo analista da empresa brasileira?
b)	Ajude o analista da empresa brasileira implementando o padrão de projeto por ele sugerido e
quem sabe você pode ser contratado pela stark coorporation. OBS: Como resposta forneça o link 
no github para a solução deste item.


 */
package Questao02;

/**
 *
 * @author Lucas Leao
 */
public class TesteMedidorCelsiusIF {
    
    public static void main(String[] args) {
        MedidorCelsius medidorCelsius = new MedidorCelsius();
        medidorCelsius.setTemperaturaCelsius(new MedidorCelsiusIFAdapter());
        medidorCelsius.temperaturaAtual();
    }
}
