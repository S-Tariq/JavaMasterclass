package com.stariq;

public class Main {

    public static void main(String[] args) {
        addDeskPhone();

    }

    public static void addDeskPhone(){
        ITelephone phone;
        phone = new DeskPhone(3456433);
        phone.powerOn();
        phone.callPhone(3456433);
        phone.answer();

    }
}
