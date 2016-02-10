package com.company.utils;

/**
 * Created by Mike on 09.02.2016.
 */
public class MasUtils {

    public static void printMas(int[] mas){
        for(int i = 0; i < mas.length; i++){
            System.out.printf("%5d", mas[i]);

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

    public static void printMas(int[][][] mas){
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas[i].length; j++){
                for(int k= 0; k < mas[i][j].length; k++){
                    System.out.printf("%5d", mas[i][j][k]);;
                }
                System.out.println();
            }
            System.out.println();
        }
    }


}
