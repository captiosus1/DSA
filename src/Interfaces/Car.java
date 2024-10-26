package Interfaces;

public class Car implements Break {
    ElectricEngine engine;
    MediaPLayer media = new MediaPLayer();

    Car(){
        engine = new ElectricEngine();
    }

    public void engineStart(){
        engine.start();
    }

    public void engineStop(){
        engine.stop();
    }

    public void engineAcc(){
        engine.accelerate();
    }

    public void mediaStart(){
        media.start();
    }

    public void mediaStop(){
        media.stop();
    }

    @Override
    public void breaks() {

    }
}
