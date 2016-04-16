package com.company.oop.lamp2;

/**
 * Created by Mike on 05.04.2016.
 */
public class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
