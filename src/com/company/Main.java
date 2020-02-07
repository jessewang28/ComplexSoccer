package com.company;

public class Main {

    public static void main(String[] args) {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(1.5, 2.5);
        Complex c = new Complex(2, 3);
        Complex d = new Complex(2.5, 3.5);
        Complex e = new Complex(3, 4);
        Complex eNeg = new Complex(-3, -4); //
        double absTest1 = e.abs(); //abs = 5.0
        double absTest2 = eNeg.abs(); //abs = 5.0
        Complex f = a.add(c);   //f = 3.0 + 5.0i
        Complex g = b.add(d);   //f = 4.0 + 6.0i
        Complex h = d.add(eNeg);
        Complex i = c.multiply(e);
        Complex j = a.add(8.8);
        Complex k = a.multiply(4);
        System.out.println(absTest1);
        System.out.println(absTest2);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);


    }
}

/*
//Complex Results
5.0
5.0
3.0 + 5.0i
4.0 + 6.0i
-0.5 + -0.5i
 */