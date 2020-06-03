package observer;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 03.06.2020
 */
interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();

    Object getState();

}
