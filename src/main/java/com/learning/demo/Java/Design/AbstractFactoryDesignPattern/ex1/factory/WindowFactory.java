package com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.factory;

import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.Interface.IButton;
import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.Interface.ICheckBox;
import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.impl.WindowButton;
import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.impl.WindowCheckBox;

public class WindowFactory implements GUIFactory {

    @Override
    public IButton createButton() {
        return new WindowButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        return new WindowCheckBox();
    }
}
