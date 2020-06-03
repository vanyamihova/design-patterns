package observer;

/**
 * Observer
 * <p>
 * A behavioral design pattern that lets you define a subscription
 * mechanism to notify multiple objects about any events that happen
 * to the object they’re observing.
 *
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 03.06.2020
 */
public class ObserverPatternMain {

    public static void main(String[] args) {
        TopicSubscriber subscriberSportTopics = new TopicSubscriber("Sport topics");
        TopicSubscriber subscriberDesignTopics = new TopicSubscriber("Design topics");
        TopicSubscriber subscriberTechnologyTopics = new TopicSubscriber("Technology topics");

        Topic topic = new Topic();
        topic.attach(subscriberSportTopics);
        topic.attach(subscriberDesignTopics);
        topic.attach(subscriberTechnologyTopics);
        topic.setMessage("Hello world");

        topic.detach(subscriberDesignTopics);
        topic.setMessage("Hello home");
    }

}
