package com.pattern.designpatterns.structral.decorator;

import com.pattern.designpatterns.structral.decorator.decorators.CompressionDecorator;
import com.pattern.designpatterns.structral.decorator.decorators.DataSourceDecorator;
import com.pattern.designpatterns.structral.decorator.decorators.EncryptionDecorator;
import com.pattern.designpatterns.structral.decorator.sources.DataSource;
import com.pattern.designpatterns.structral.decorator.sources.FileDataSource;

public class DecoratorMain {
    public static void main(String[] args) {
        String salaryRecords = "Name,Job\nMuharrem Koc,Java Developer";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("src/out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("src/out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
