package com.example.demo.Multipliers;


import com.example.demo.Directions;
import com.example.demo.Picture.MyPoint;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
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
        RealMatrix transformMatrix = new Array2DRowRealMatrix(matrix);
        RealMatrix pointMatrix = new Array2DRowRealMatrix(new double[][]{{1}, {2}, {3}, {1}});
        RealMatrix result = transformMatrix.multiply(pointMatrix);
        double delta = 0;
        double eps = 0.0001;
        double[] coordinates = myPoint.getCoordinates();
        for (int i = 0; i < 4; i++) {
            delta += Math.abs(coordinates[i] - result.getEntry(i, 0));
        }
        assertTrue(delta < eps);
        /*RealMatrix matrix1 = new Array2DRowRealMatrix(new double[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}});
        RealMatrix matrix2 = new Array2DRowRealMatrix(new double[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}});
        RealMatrix result = matrix1.multiply(matrix2);
        System.out.println(result.toString());*/
    }
}