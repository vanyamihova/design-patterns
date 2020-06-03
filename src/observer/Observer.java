package observer;

/**
 * Observer notifies the {@link Subject} for an update
 *
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 03.06.2020
 */
interface Observer {

    void update(Subject subject);

}
