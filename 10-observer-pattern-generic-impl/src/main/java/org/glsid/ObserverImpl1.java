package org.glsid;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        var newState = ((ObservableImpl)observable).getState();
        System.out.println("Observer 1 received new state: " + newState);
    }

    /*
    note: This seems quite a flawed implementation, what if we want to observe multiple subjects and each one
    requires a different way to react to it.
    guess we might need to either extends the observer interface, or have something like event source in js or javafx
    */
}
