package com.pattern.designpatterns.creational.singleton.lazyloading;



public class MultiThreadMain {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadBar.start();
        threadFoo.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            LazySingleton lazySingleton=LazySingleton.getInstance("FOO");
            System.out.println(lazySingleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            LazySingleton lazySingleton = LazySingleton.getInstance("BAR");
            System.out.println(lazySingleton.value);
        }
    }
}
