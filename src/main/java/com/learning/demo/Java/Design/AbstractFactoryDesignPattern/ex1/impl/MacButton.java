package com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.impl;


import com.learning.demo.Java.Design.AbstractFactoryDesignPattern.ex1.Interface.IButton;

public class MacButton implements IButton {

    @Override
    public void render() {
        System.out.println("Mac Button Enabled");
    }
}
