package com.springapp.mvc;

import java.util.HashMap;
import java.util.*;

class A {
    public String name;

    public int hashCode(){
        return name.hashCode();
    }

    public boolean equals(Object o){
        if(o instanceof A){
            return name.equals( ((A)o).name );
        }
        return false;
    }

    public static void main(int... args) {
        System.out.println(1);
    }
    public static void main(String[] args) {
        int n = 3, k = 5;
        while (n!=k) {
            n = (n*2) % 11;
            k = (k*7) %11;
        }
        System.out.println(0x2D);
    }
}
