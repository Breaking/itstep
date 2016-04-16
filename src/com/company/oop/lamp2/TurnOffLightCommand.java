package com.company.oop.lamp2;

/**
 * Created by Mike on 05.04.2016.
 */
public class TurnOffLightCommand implements Command {
    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
