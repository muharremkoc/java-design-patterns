package com.pattern.designpatterns.structral.decorator.sources;

public interface DataSource {
    void writeData(String data);

    String readData();
}
