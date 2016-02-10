package com.company;

import com.company.utils.MasUtils;

import java.util.Random;

/**
 * Created by Mike on 09.02.2016.
 */

//task "Make Set" from random array[][][]
public class Lesson09FebruaryPart2 {
    public static void main(String[] args) {
        int[][][] mas = new int[3][3][4];
        initMas(mas);
        MasUtils.printMas(mas);


    }

    public static void initMas(int[][][] mas) {
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int k = 0; k < mas[i][j].length; k++) {
                    mas[i][j][k] = random.nextInt(10);
                }
            }
        }
    }
}
