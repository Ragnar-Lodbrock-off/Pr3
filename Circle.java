package ru.mirea.gibo0119.pr3;

import java.util.Arrays;

  publicclassCircle {

private double radius;

public double getRadius() {
        return radius;
        }

public void setRadius(double radius) {
        this.radius = radius;
        }

public double getSquare(double radius) {
        return Math.PI * Math.pow(radius,2);
        }

public double getCircleLength(double radius) {
        return Math.PI * radius * 2;
        }
        }
