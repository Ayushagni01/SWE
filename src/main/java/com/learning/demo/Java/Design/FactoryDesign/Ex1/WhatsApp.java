package com.learning.demo.Java.Design.FactoryDesign.Ex1;

public class WhatsApp implements INotification{
    @Override
    public String send() {
        return "WhatsApp Message Send";
    }
}
