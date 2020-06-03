package observer;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 03.06.2020
 */
final class TopicSubscriber implements Observer {

    private String label;

    TopicSubscriber(String label) {
        this.label = label;
    }

    @Override
    public void update(Subject subject) {
        System.out.println("'" + label + "' received a message: " + subject.getState());
    }
}
