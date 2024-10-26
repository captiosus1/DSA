package Interfaces;

public class MediaPLayer implements Media{
    @Override
    public void start() {
        System.out.println("Media Player started");
    }

    @Override
    public void stop() {
        System.out.println("Media Player stopped");
    }
}
