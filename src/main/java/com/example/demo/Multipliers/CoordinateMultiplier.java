package com.example.demo.Multipliers;

import com.example.demo.Directions;
import com.example.demo.Picture.MyPoint;

import java.util.LinkedList;

public interface CoordinateMultiplier {
    void multiplie(LinkedList<MyPoint> myPoints, Directions direction);
}
