package com.learning.demo.Java.Design.FactoryDesign.Ex2.impl;

import com.learning.demo.Java.Design.FactoryDesign.Ex2.Interface.IButton;

public class MacButton implements IButton {

    @Override
    public void render() {
        System.out.println("Mac Button Enabled");
    }
}
