/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao02;

/**
 *
 * @author Lucas Leao
 */
public class MedidorCelsius {
    
    private MedidorCelsiusIFAdapter temperaturaCelsius;

    public MedidorCelsiusIFAdapter getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public void setTemperaturaCelsius(MedidorCelsiusIFAdapter temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }
    
    
    public void temperaturaAtual(){
        System.out.println("Temperatura em Celsius: "+getTemperaturaCelsius().medirTemperatura());
    }
    
}
