package com.pattern.designpatterns.creational.builder.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route="Detaysoft Teknoloji,Sivas";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
