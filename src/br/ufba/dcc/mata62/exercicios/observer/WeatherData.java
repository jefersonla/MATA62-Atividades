package br.ufba.dcc.mata62.exercicios.observer;

import java.util.ArrayList;

/**
 *
 * @author Jeferson Lima
 */
public class WeatherData implements Subject{
    private int temperature;
    private int pressure;
    private int humidity;

    private ArrayList<Observer> observing;
    
    public WeatherData(int temperature, int humidity, int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
    
    public WeatherData(){
        this(0,0,0);
    }
    
    @Override
    public void registerObserver(Observer new_observer) {
        observing.add(new_observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observing.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observing){
            observer.update(temperature, humidity, pressure);
        }
    }
       
}
