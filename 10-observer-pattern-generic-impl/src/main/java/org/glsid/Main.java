package org.glsid;

public class Main {

    public static void main(String[] args) {
        var observable = new ObservableImpl(10);
        var observer1 = new ObserverImpl1();
        var observer2 = new ObserverImpl2();

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        System.out.println("Observable's current state: " + observable.getState());

        System.out.println("==================================");

        System.out.println("Observable(10) -> Observable(15)");
        observable.setState(15);

        System.out.println("==================================");

        System.out.println("Remove observer 1");
        observable.removeObserver(observer1);


        System.out.println("Observable(15) -> Observable(20)");
        observable.setState(20);
    }
}
