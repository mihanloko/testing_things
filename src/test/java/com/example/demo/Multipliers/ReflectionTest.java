package com.example.demo.Multipliers;


import com.example.demo.Directions;
import com.example.demo.Picture.MyPoint;
import org.junit.Test;


import java.util.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ReflectionTest {

    @Test
    public void transform() {
        double[][] matrix = {
                {-1, 0, 0 , 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
        Reflection reflection = new Reflection();
        MyPoint myPoint = new MyPoint(1, 2, 3);
        LinkedList<MyPoint> myPoints = new LinkedList<>();
        myPoints.add(myPoint);
        reflection.multiplie(myPoints, Directions.OXPlus);

        double delta = 0;
        double eps = 0.0001;
        double[] coordinates = myPoint.getCoordinates();
        assertTrue(delta < eps);
    }
}