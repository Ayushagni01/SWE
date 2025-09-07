package com.learning.demo.Java.Design.FactoryDesign.Ex1;

public class Client_Factory {
    public static void main(String[] args) {
        INotification sms = FactoryMethod.getNotificationObject("SMS");
        System.out.println(sms.send());
    }
}
