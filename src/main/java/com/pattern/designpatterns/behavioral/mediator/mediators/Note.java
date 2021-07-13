package com.pattern.designpatterns.behavioral.mediator.mediators;

public class Note {
    private String name;
    private String text;

    public Note() {
        name="New Note";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return name;
    }
}
