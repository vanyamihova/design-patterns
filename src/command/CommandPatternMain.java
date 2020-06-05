package command;

/**
 * A behavioral design pattern that turns a request into a
 * stand-alone object that contains all information about
 * the request. This transformation lets you parameterize
 * methods with different requests, delay or queue a
 * request’s execution, and support undoable operations.
 *
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 05.06.2020
 */
public class CommandPatternMain {

    public static void main(String[] args) {
        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl(lightOnCommand, lightOffCommand);

        remoteControl.turnOnTheLamp();
        remoteControl.turnOffTheLamp();
    }

}
