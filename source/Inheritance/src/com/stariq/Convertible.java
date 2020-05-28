package com.stariq;

public class Convertible extends Car{

    private String roof;

    public Convertible(String colour, String roof) {
        super("Convertible", colour, "4Wheel", 4, 2, 6, false);
        this.roof = roof;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
            changeGear(1);
        } else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        } else if(newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        } else if(newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        } else {
            changeGear(4);
        }
        if(newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

    private void useAmplifier(){
        System.out.println("Convertible.useAmplifier() called.");
    }

    @Override
    public void playStereo() {
        System.out.println("Convertible.playStereo() called.");
        useAmplifier();
        super.playStereo();
    }
}
