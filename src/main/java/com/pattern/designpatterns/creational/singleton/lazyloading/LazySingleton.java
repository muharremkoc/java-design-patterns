package com.pattern.designpatterns.creational.singleton.lazyloading;

public class LazySingleton {
    // The field must be declared volatile so that double check lock would work
    // correctly.
    private static volatile LazySingleton instance;

    public String value;

    private LazySingleton(String value) {
        this.value = value;
    }

    public static LazySingleton getInstance(String value) {

        LazySingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(LazySingleton.class) {
            if (instance == null) {
                instance = new LazySingleton(value);
            }
            return instance;
        }
    }
}
