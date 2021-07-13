package com.pattern.designpatterns.creational.factory;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says-'I'am Java Developer' ");
    }
}
