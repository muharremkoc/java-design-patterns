package com.pattern.designpatterns.creational.prototype;

import com.pattern.designpatterns.creational.prototype.shapes.Circle;
import com.pattern.designpatterns.creational.prototype.shapes.Rectangle;
import com.pattern.designpatterns.creational.prototype.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class PrototypeMain {
    public static void main(String[] args) {

        List<Shape>shapes=new ArrayList<>();
        List<Shape>copyShapes=new ArrayList<>();

        Circle circle=new Circle();
        circle.x=10;
        circle.y=20;
        circle.radius=5;
        circle.color="Red";
        shapes.add(circle);

        Circle anotherCircle=(Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle=new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, copyShapes);
        
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> copyShapes) {
        for (Shape shape:shapes
             ) {
            copyShapes.add(shape.clone());
        }
        for (int i=0;i<shapes.size();i++){
            if (shapes.get(i)!= copyShapes.get(i)){
                System.out.println(i + ": Shapes are different objects ");
                if (shapes.get(i).equals(copyShapes.get(i))) {
                    System.out.println(i + ": And they are identical");
                } else {
                    System.out.println(i + ": But they are not identical");
                }
            }else {
                System.out.println(i + ": Shape objects are the same");
            }

        }
    }
}
