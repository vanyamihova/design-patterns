package observer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 03.06.2020
 */
final class Topic implements Subject {

    private String message;
    private Set<Observer> observers;

    Topic() {
        this.observers = new HashSet<>();
    }

    @Override
    public void attach(Observer observer) {
        if (observer == null) {
            return;
        }
        observers.add(observer);
        System.out.println("An observer has been attached");
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
        System.out.println("An observer has been detached");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public Object getState() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

}
