package com.company.proceduredev;

import java.util.Random;

/**
 * Created by Mike on 04.02.2016.
 */

//task "Make Set" from random array[]
public class Lesson04February {
    public static int NULL_ELEMENT = -1;

    public static void main(String[] args){
        int[] mas = new int[10];
        int[] mas2;

        initMas(mas);
        printMas(mas);
        System.out.println();
        mas2 = getSet(mas);
        printMas(mas2);

    }

    public static void initMas(int[] mas){
        Random random = new Random();
        for(int i = 0; i < mas.length; i++){
            mas[i] = random.nextInt(10);
        }

    }

    public static void printMas(int[] mas){
        for(int i = 0; i < mas.length; i++){
            System.out.printf("%5d", mas[i]);

        }
    }

    public static int[] getSet(int[] mas){
        int[] result = new int[mas.length];
        int count = 0;

        for(int i = 0; i < result.length; i++){
            result[i] = NULL_ELEMENT;
        }

        for(int i = 0; i < mas.length; i++){
            if (!findSame(mas[i], result)){
                result[count] = mas[i];
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
