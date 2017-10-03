package ru.unlamzg;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) list.add(0, ((i%3) + 1)* (i%4 - 1));
        for (Integer i:list) {
            System.out.println(i);
        }
    }

}

class Point {

}