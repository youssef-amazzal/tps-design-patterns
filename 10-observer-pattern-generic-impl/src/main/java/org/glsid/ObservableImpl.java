package org.glsid;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private final List<Observer> observers = new ArrayList<>();
    private Integer state;

    public ObservableImpl(Integer state) {
        this.state = state;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(obs -> obs.update(this));
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        notifyObservers();
    }
}
