package com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.factory;

import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.Interface.IButton;
import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.Interface.ICheckBox;
import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.impl.MacButton;
import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.impl.MacCheckBox;

public class MacFactory implements GUIFactory{

    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
