package interfaces;

public class Gearbox {

    private boolean clutchIsIn;

    public void operateClutch(boolean inOrOut){
        clutchIsIn = inOrOut;
    }
}
