package com.kodilla.stream.collections.arrays;

import com.kodilla.stream.collections.interfaces.Circle;
import com.kodilla.stream.collections.interfaces.Shape;
import com.kodilla.stream.collections.interfaces.Square;
import com.kodilla.stream.collections.interfaces.Triangle;

import java.util.Random;

public class ShapeApplication {
    Random random = new Random();
    int drawnNumber = random.nextInt(160 + 1 - 100) + 100;

    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapes = new Shape[random.nextInt(20) + 1];
        for (int n = 0; n < shapes.length; n++)
            shapes[n] = drawShape();

        for ( Shape shape : shapes)
            ShapeUtils.displayShapeInfo(shape);
    }
    private static Shape drawShape() {
        Random random = new Random();
        int drawnShapeKind = random.nextInt(3);     // possible values: 0, 1, 2
        double a = getRandomSize(random);
        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else {
            double b = getRandomSize(random);
            double c = getRandomSize(random);
            return new Triangle(a, b, c);
        }
    }

    private static double getRandomSize(Random random) {
        return random.nextDouble() * 100 + 1;       // possible values: 1.000-100.999...
    }
}
