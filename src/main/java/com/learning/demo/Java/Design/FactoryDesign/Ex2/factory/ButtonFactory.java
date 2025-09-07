package com.learning.demo.Java.Design.FactoryDesign.Ex2.factory;

import com.learning.demo.Java.Design.FactoryDesign.Ex2.Interface.IButton;
import com.learning.demo.Java.Design.FactoryDesign.Ex2.impl.MacButton;
import com.learning.demo.Java.Design.FactoryDesign.Ex2.impl.WindowButton;

public class ButtonFactory {

    public static IButton getButton(String text){
        if( text.equals("Mac")) {
            return new MacButton();
        }
        else{
            return new WindowButton();
        }
    }
}
