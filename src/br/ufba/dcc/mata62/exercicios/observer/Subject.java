package br.ufba.dcc.mata62.exercicios.observer;

/**
 *
 * @author Jeferson Lima
 */
public interface Subject {
    public void registerObserver(Observer new_observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
