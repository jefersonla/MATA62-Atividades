package br.ufba.dcc.mata62.exercicios.observer;

/**
 *
 * @author Jeferson Lima
 */
public class CurrentConditionsDisplay implements Observer{
    private int temperature;
    private int humidity;
    private int pressure;
    
    public CurrentConditionsDisplay(){
        this.temperature = 0;
        this.humidity = 0;
        this.pressure = 0;
    }
    
    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }
    
}
