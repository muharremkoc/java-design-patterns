package com.pattern.designpatterns.behavioral.observer;

import com.pattern.designpatterns.behavioral.observer.editor.Editor;
import com.pattern.designpatterns.behavioral.observer.listeners.EmailNotificationListener;
import com.pattern.designpatterns.behavioral.observer.listeners.LogOpenListener;

public class ObserverMain {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
