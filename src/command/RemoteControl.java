package command;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 05.06.2020
 */
final class RemoteControl {

    private Command lightsOnCommand;

    private Command lightsOffCommand;

    RemoteControl(Command lightsOnCommand, Command lightsOffCommand) {
        this.lightsOnCommand = lightsOnCommand;
        this.lightsOffCommand = lightsOffCommand;
    }

    void turnOnTheLamp() {
        lightsOnCommand.execute();
    }

    void turnOffTheLamp() {
        lightsOffCommand.execute();
    }

}
