package com.learning.demo.Java.Design.AbstractFactoryDesignPattern;

import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.Interface.IButton;
import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.Interface.ICheckBox;
import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.factory.GUIFactory;
import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.factory.MacFactory;
import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.factory.WindowFactory;



public class AbstractFactoryClient {
    public static void main(String[] args) {

        GUIFactory factory;
        String osType = "Mac";

        if( osType.equals("Mac")) {
            factory =  new MacFactory();
        }else {
            factory = new WindowFactory();
        }

        IButton button = factory.createButton();
        ICheckBox checkBox = factory.createCheckBox();

        button.render();
        checkBox.render();
    }
}
