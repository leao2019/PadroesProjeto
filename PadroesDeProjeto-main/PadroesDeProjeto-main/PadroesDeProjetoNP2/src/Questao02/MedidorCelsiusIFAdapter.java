package Questao02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.stark.cooporation.FarenheitSensor;

/**
 *
 * @author Lucas Leao
 */
public class MedidorCelsiusIFAdapter implements MedidorCelsiusIFInterface{

    @Override
    public double medirTemperatura() {
        FarenheitSensor farenheitSensor = new FarenheitSensor();
        double tempFarenheit = farenheitSensor.getTemperaturaFarenheit();
        double tempCelsius =(tempFarenheit-32)/1.8;
        System.out.println("Temperatura em Farenheit: "+ tempFarenheit);
        return tempCelsius;
    }
    
}
