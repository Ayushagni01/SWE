package com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.factory;

import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.Interface.IButton;
import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.Interface.ICheckBox;

public interface GUIFactory {
    IButton createButton();
    ICheckBox createCheckBox();
}
