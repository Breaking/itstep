package com.company.proceduredev;

import java.util.Random;

/**
 * Created by Mike on 14.01.2016.
 */
public class lesson14January {
    public static void main(String[] args){
        int [][] mas = new int[10][20];
        initMas(mas);
        printMas(mas);
    }

    public static void initMas(int[][] mas){
        Random random = new Random();
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas[i].length; j++){
                mas[i][j] = -50 + random.nextInt(100);
            }
        }
    }

    public static void printMas(int[][] mas){
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas[i].length; j++){
                System.out.printf("%5d", mas[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] rowSumm(int[][] mas){
        int[] summ = new int[mas.length];
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas[i].length; j++){
                summ[i] += mas[i][j];
            }
        }
        return summ;
    }

}
