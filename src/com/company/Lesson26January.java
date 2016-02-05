package com.company;

/**
 * Created by Mike on 26.01.2016.
 */
public class Lesson26January {

    public static void main(String[] args){
        int[][][] mas = {{{1, 2, 3}, {1, 2, 3}}};

        int [][][] mas2 = {{{1, 2, 3}, {4, 5, 6}},{{7, 8, 9},{10, 11, 12}}};

        System.out.println(mas.length);
        System.out.println(mas2.length);
        System.out.println(mas2[1][1][0]);
        System.out.println(mas2[1][0][2]);
    }

}
