package com.pattern.designpatterns.structral.adapter.pegs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SquarePeg {
    private double width;
    public double getSquare(){
        double result;
        result=Math.pow(this.width,2);
        return result;
    }
}
