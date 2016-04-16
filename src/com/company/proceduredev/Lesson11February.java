package com.company.proceduredev;

import com.company.utils.MasUtils;

import java.util.Random;

/**
 * Created by Mike on 11.02.2016.
 */
public class Lesson11February {
    public static int NULL_ELEMENT = -1;

    public static void main(String[] args){
        int[] mas = new int[10];
        int[] resultMas;
        int[] temp;


        initMas(mas);
        MasUtils.printMas(mas);
        resultMas = getSet(mas);
        System.out.println();
        MasUtils.printMas(resultMas);
        System.out.println();
        System.out.println("---------------------Result------------------");

        for(int i = 0; i < 9; i++){
            initMas(mas);
            temp = mergeMas(resultMas, mas);
            resultMas = getSet(temp);
            System.out.println(i + 1);
            MasUtils.printMas(mas);
            System.out.println();
            MasUtils.printMas(resultMas);
            System.out.println();
        }

    }

    public static void initMas(int[] mas){
        Random random = new Random();
        for(int i = 0; i < mas.length; i++){
            mas[i] = random.nextInt(10);
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

    public static int[] mergeMas(int[] m1, int[] m2){
        int[] m = new int[m1.length + m2.length];

        for(int i = 0; i < m1.length; i++){
            m[i] = m1[i];
        }

        for(int i = m1.length; i < m.length; i++){
            m[i] = m2[i - m1.length];
        }
        return m;
    }



}
