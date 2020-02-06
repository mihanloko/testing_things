package com.example.demo.Multipliers;

import com.example.demo.Directions;
import com.example.demo.Picture.MyPoint;

import java.util.LinkedList;

public class Reflection implements CoordinateMultiplier {
    @Override
    public void multiplie(LinkedList<MyPoint> myPoints, Directions direction) {
        double[][] matrix = {
                {1, 0, 0 , 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
        switch (direction) {
            case OXPlus:
            case OXMinus:
                matrix[0][0] = -1;
                break;
            case OYPlus:
            case OYMinus:
                matrix[1][1] = -1;
                break;
            case OZPlus:
            case OZMinus:
                matrix[2][2] = -1;
                break;
        }

        for (MyPoint myPoint : myPoints) {
            myPoint.changeCoordinates(matrix);
        }
    }
}
