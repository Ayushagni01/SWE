package com.learning.demo.Java.Design.FactoryDesign.Ex2;

import com.learning.demo.Java.Design.FactoryDesign.Ex2.Interface.IButton;
import com.learning.demo.Java.Design.FactoryDesign.Ex2.Interface.ICheckBox;
import com.learning.demo.Java.Design.FactoryDesign.Ex2.factory.ButtonFactory;
import com.learning.demo.Java.Design.FactoryDesign.Ex2.factory.CheckBoxFactory;
import com.learning.demo.Java.Design.FactoryDesign.Ex2.impl.MacButton;

public class ClientFactory {
    public static void main(String[] args) {

        IButton mac = ButtonFactory.getButton("Mac");
        mac.render();


        IButton window = ButtonFactory.getButton("Window");
        window.render();

        ICheckBox macC = CheckBoxFactory.getCheckBox("Mac");
        macC.render();


        ICheckBox windowC = CheckBoxFactory.getCheckBox("Window");
        windowC.render();


    }
}
