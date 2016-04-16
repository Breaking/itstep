package com.company.proceduredev;

import com.company.utils.MasUtils;

import java.util.Random;

/**
 * Created by Mike on 09.02.2016.
 */
//task "Make Set" from random array[][]
public class Lesson09February {
    public static int NULL_ELEMENT = -1;

    public static void main(String[] args){
        int[][] mas = new int[4][2];
        int[] mas2;
        initMas(mas);
        MasUtils.printMas(mas);
        System.out.println("    --------------------RESULT--------------------");
        mas2 = getSet(mas);
        MasUtils.printMas(mas2);

    }

    public static void initMas(int[][] mas){
        Random random = new Random();
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas[i].length; j++){
                mas[i][j] = random.nextInt(10);
            }
        }
    }

    public static int[] getSet(int[][] mas){


        int row = 0;
        int count = 0;
        //int[] result = new int[mas[0].length];
        int[] result = new int[mas.length * mas[0].length];

        for(int i = 0; i < result.length; i++){
            result[i] = NULL_ELEMENT;
        }

//        for(int i = 0; i < mas[row].length; i++){
//            if (!findSame(mas[row][i], result)){
//                result[count] = mas[row][i];
//                count++;
//            }
//
//            //result[count] = mas[i];
//            //count++;
//        }

        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas[i].length; j++ )
            if (!findSame(mas[i][j], result)){
                result[count] = mas[i][j];
                count++;
            }

            //result[count] = mas[i];
            //count++;
        }



        int[] r = new int[calculateSize(result)];
        for(int i = 0; i < r.length; i++){
            r[i] = result[i];
        }
        return r;

    }

    public static boolean findSame(int number, int[] result){
        for(int i = 0; i < result.length; i++){
            if(number == result[i]) {
                return true;
            }
        }
        return false;
    }

    public static int calculateSize(int[] result){
        int length = 0;
        for (int i = 0; i < result.length; i++){
            if(result[i] != NULL_ELEMENT){
                length++;
            }
        }
        return length;
    }
}
