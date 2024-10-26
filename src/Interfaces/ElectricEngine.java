package Interfaces;

import javax.sound.midi.Soundbank;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("This is Electric Engine starting");
    }

    @Override
    public void stop() {
        System.out.println("This is Electric Engine Stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("This is Electric Engine accelerating");
    }
}
