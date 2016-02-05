package com.company;

import java.util.Random;

/**
 * Created by Mike on 02.02.2016.
 */
public class Lesson02February {

    public static void main(String[] args) {
        int[][] m;

        m = initMas();
        printMas(m);
        System.out.println("-------------------------------------");
        randMas(m);

    }

    public static int[][] initMas() {
        int[][] m = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                m[i][j] = (i + 2) * (j + 2); //m[i - 2][j - 2] = i * j;
            }
        }
        return m;
    }

    public static void printMas(int[][] m){
        System.out.printf("  ");

        for(int i = 0; i < 8; i++){
            System.out.printf("%5d", i + 2);
        }
        System.out.println();
        System.out.println("--------------------------------------------------");

        for(int i = 0; i < 8; i++){
            System.out.print(i +2 + "|");
            for(int j = 0; j < 8; j++){
                System.out.printf("%5d", m[i][j]);
            }
            System.out.println();
        }

    }

    public static void randMas(int[][] m){
        Random random = new Random();

        int[][] used = new int[8][8];

        int c = 0;
        int iter = 0;
        for(; ; ){
            for(; ; ){
                iter++;
                int i = random.nextInt(7);
                int j = random.nextInt(7);
                if(used[i][j] == 0){
                    c++;
                    used[i][j] = 1;
                    used[j][i] = 1;
                    System.out.println(c + ":" + (i + 2) + " * " + (j + 2) + " = " + m[i][j]);
                    break;
                }
            }

            if (c == 15){
                break;
            }
        }
        System.out.println(iter);
    }

}
