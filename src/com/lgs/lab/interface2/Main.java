package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Devide;
import com.lgs.lab.interface1.Minus;
import com.lgs.lab.interface1.Multiply;
import com.lgs.lab.interface1.Plus;

public class Main {
    public static void main(String[] args) {
        Plus p = new MyCalculator();
        Devide d = new MyCalculator();
        Multiply m = new MyCalculator();
        Minus minus = new MyCalculator();

        p.plus(); System.out.println(" ");
        d.devide(); System.out.println(" ");
        m.multiply(); System.out.println(" ");
        minus.minus(); System.out.println(" ");
    }
}

