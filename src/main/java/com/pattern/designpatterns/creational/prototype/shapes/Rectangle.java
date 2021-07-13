package com.pattern.designpatterns.creational.prototype.shapes;

import java.util.Objects;

public class Rectangle extends Shape{
    public int width;
    public int height;

       public Rectangle(){

       }
       public Rectangle(Rectangle target){
           super(target);
           if (target!=null){
               this.width= target.width;
               this.height=target.height;
           }
       }


    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle))return  false;
        Rectangle shape2=(Rectangle) object2;
        return shape2.width==width && shape2.height==height;
    }
}
