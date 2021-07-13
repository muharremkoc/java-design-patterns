package com.pattern.designpatterns.structral.adapter.adapters;

import com.pattern.designpatterns.structral.adapter.pegs.RoundPeg;
import com.pattern.designpatterns.structral.adapter.pegs.SquarePeg;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SquarePegAdapter  extends RoundPeg {
    private SquarePeg peg;

    @Override
    public double getRadius() {
         double result;
        result=Math.sqrt(Math.pow((peg.getWidth()/2),2)*2);
        return result;
    }
}
