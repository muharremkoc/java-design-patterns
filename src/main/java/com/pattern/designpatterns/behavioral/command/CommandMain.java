package com.pattern.designpatterns.behavioral.command;

import com.pattern.designpatterns.behavioral.command.editor.Editor;

public class CommandMain {
    public static void main(String[] args) {
        Editor editor=new Editor();
        editor.init();
    }
}
