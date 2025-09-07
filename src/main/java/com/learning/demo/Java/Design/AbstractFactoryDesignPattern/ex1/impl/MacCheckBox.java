package com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.impl;


import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.Interface.ICheckBox;

public class MacCheckBox implements ICheckBox {
    @Override
    public void render() {
        System.out.println("Mac CheckBox Enabled");
    }
}
