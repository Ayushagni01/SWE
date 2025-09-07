package com.learning.demo.Java.Design.FactoryDesign.Ex1;

public class Sms implements INotification{
    @Override
    public String send() {
        return "Sms Message Send";
    }
}
