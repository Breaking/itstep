package com.company.oop.lamp;

/**
 * Created by Mike on 05.04.2016.
 */
public class Main {
    public static void main(String[] args) {

        Light light = new Light();
        Command command1 = new TurnOnLightCommand(light);
        Command command2 = new TurnOffLightCommand(light);

        Switcher switcher = new Switcher(command1, command2);
        switcher.turnOn();
        switcher.turnOff();

    }
}
