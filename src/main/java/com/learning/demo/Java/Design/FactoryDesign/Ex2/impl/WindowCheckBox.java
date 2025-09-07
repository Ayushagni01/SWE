package com.learning.demo.Java.Design.FactoryDesign.Ex2.impl;

import com.learning.demo.Java.Design.FactoryDesign.Ex2.Interface.ICheckBox;

public class WindowCheckBox implements ICheckBox {

    @Override
    public void render() {
        System.out.println("Window CheckBox Enabled");
    }
}
