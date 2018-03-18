package com.stariq;

public class Main {

    public static void main(String[] args) {
        addDeskPhone();
        addMobilePhone();
    }

    public static void addDeskPhone(){
        ITelephone phone;
        phone = new DeskPhone(3456433);
        phone.powerOn();
        phone.callPhone(3456433);
        phone.answer();
    }

    public static void addMobilePhone(){
        ITelephone phone = new MobilePhone(557856);
        phone.powerOn();
        phone.callPhone(557856);
        phone.answer();
    }
}
