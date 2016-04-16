package com.company.oop.lamp2;


/**
 * Created by Mike on 05.04.2016.
 */
public class Main {
    public static void main(String[] args) {

        Light light = new Light();

        Switcher switcher = new Switcher(new Command() {
            @Override
            public void execute() {
                light.turnOn();
            }
        }, new Command() {
            @Override
            public void execute() {
                light.turnOff();
            }
        });



        switcher.turnOn();
        switcher.turnOff();

    }
}
