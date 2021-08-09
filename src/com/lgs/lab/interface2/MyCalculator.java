package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numarable;

public class MyCalculator implements Numarable {
    public void plus(){
        int a = 64;
        int b = 4839;
        System.out.println("Result: "+(a+b));
    }
    public void minus(){
        int a = 64;
        int b = 4839;
        System.out.println("Result: "+(a-b));
    }
    public void multiply(){
        int a = 64;
        int b = 4839;
        System.out.println("Result: "+(a*b));
    }
    public void devide(){
        int a = 64;
        int b = 4839;
        System.out.println("Result: "+(a/b));
    }

}
