package com.example.demo.Transformers;

import com.example.demo.Directions;
import com.example.demo.Picture.MyPoint;

import java.util.LinkedList;

public interface Transformer {
    void transform(LinkedList<MyPoint> myPoints, Directions direction);
}
