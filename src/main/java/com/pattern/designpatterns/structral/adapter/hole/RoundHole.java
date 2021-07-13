package com.pattern.designpatterns.structral.adapter.hole;

import com.pattern.designpatterns.structral.adapter.pegs.RoundPeg;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class RoundHole {
    private double radius;


    public boolean fits(RoundPeg peg) {
        boolean result;
        result=(this.getRadius()>=peg.getRadius());
        return result;
    }
}
