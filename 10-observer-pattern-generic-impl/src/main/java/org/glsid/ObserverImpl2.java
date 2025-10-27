package org.glsid;

public class ObserverImpl2 implements Observer {
    @Override
    public void update(Observable observable) {
        var newState = ((ObservableImpl)observable).getState();
        System.out.println("Observer 2 received new state: " + newState);
    }
}
