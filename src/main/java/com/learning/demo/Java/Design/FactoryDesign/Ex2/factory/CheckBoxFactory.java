package com.learning.demo.Java.Design.FactoryDesign.Ex2.factory;

import com.learning.demo.Java.Design.FactoryDesign.Ex2.Interface.ICheckBox;
import com.learning.demo.Java.Design.FactoryDesign.Ex2.impl.MacCheckBox;
import com.learning.demo.Java.Design.FactoryDesign.Ex2.impl.WindowCheckBox;

public class CheckBoxFactory {
    public static ICheckBox getCheckBox(String text){
        if( text.equals("Mac")) {
            return new MacCheckBox();
        }
        else{
            return new WindowCheckBox();
        }
    }
}
