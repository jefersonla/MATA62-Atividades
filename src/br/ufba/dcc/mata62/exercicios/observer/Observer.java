package br.ufba.dcc.mata62.exercicios.observer;

/**
 *
 * @author Jeferson Lima
 */
public interface Observer {
    public void update(int temperature, int humidity, int pressure);
}
