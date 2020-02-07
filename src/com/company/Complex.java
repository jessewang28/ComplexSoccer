package com.company;

public class Complex {
    private double x;
    private double y;

    public Complex(double a){
        x=a;
        y=0;
    }

    public String toString(){
        String c = x + " + " + y + "i";
        return c;
    }

    public Complex(double a, double b){
        x=a;
        y=b;
    }

    public double abs(){
        double squared = Math.pow(x, 2) + Math.pow(y,2);
        double sqrt = Math.sqrt(squared);
        return sqrt;
    }

    public Complex add(Complex other){
        double first = this.x + other.x;
        double second = this.y + other.y;
        Complex z = new Complex (first, second);
        return z;
    }







}

