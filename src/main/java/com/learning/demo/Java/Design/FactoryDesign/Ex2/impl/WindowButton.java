package com.learning.demo.Java.Design.FactoryDesign.Ex2.impl;

import com.learning.demo.Java.Design.FactoryDesign.Ex2.Interface.IButton;

public class WindowButton implements IButton {

    @Override
    public void render() {
        System.out.println("Window Button Enabled");
    }
}
