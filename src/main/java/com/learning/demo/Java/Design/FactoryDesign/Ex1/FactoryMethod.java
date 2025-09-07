package com.learning.demo.Java.Design.FactoryDesign.Ex1;

public class FactoryMethod {
    public static INotification getNotificationObject( String text) {
        if( text.equals("SMS")) {
            return new Sms();
        }
        else {
            return new WhatsApp();
        }
     }
}
