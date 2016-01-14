package com.company;

import java.util.IntSummaryStatistics;
import java.util.Random;

/**
 * Created by Mike on 12.01.2016.
 */
public class Lesson12January {

    public static void main(String[] args) {
        int[] mas = new int[10];
        int factorialCount = 5;

        System.out.println(factorial(factorialCount));

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " " + simpleNumber(i));
        }


        printMas(mas);
        System.out.println("_______________________________");
        initMas(mas);
        printMas(mas);
        System.out.println("_______________________________");
        findMaxPair2(mas);
//
//        Random random = new Random();
//
//        for(int i = 0; i < 10; i++){
//            mas[i] = random.nextInt(1000);
//        }
        //      printMas(mas);

        System.out.println("positive " + procent(positiveCount(mas), mas.length));
        System.out.println("negative " + procent(negativeCount(mas), mas.length));

        Integer integer = 100;
        //System.out.println(integer);
        test(integer);
        System.out.println(integer);
        //Integer

    }

    public static void test(Integer integer) {
        integer++;
        System.out.println(integer);
    }

    public static void initMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (new Random().nextInt(100) - 50);
        }
    }

    public static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }

    public static void findMaxPair(int[] mas) {
        if (mas.length < 3) {
            System.out.println("mas.length must be >=2");
        }
        int sum = mas[0] + mas[1];
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] + mas[i + 1] > sum) {
                sum = mas[i] + mas[i + 1];
                max1 = i;
                max2 = i + 1;
            }
        }
        System.out.println("i1 = " + max1 + "i2 = " + max2 + "sum = " + sum);

    }

    public static void findMaxPair2(int[] mas) {
        if (mas.length < 3) {
            System.out.println("mas.length must be >=2");
        }
        int sum = mas[0] + mas[1];
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                //if (mas[i] + mas[j] > sum)
                if ((i != j) && (mas[i] + mas[j] > sum)){
                    sum = mas[i] + mas[j];
                    max1 = i;
                    max2 = j;
                }
            }
        }
        System.out.println("i1 = " + max1 + "i2 = " + max2 + "sum = " + sum);


    }


    public static int positiveCount(int[] mas) {
        int c = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] >= 0) {
                c++;
            }
        }
        return c;
    }

    public static int negativeCount(int[] mas) {
        int c = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {
                c++;
            }
        }
        return c;
    }


    public static int procent(int x, int y) {
        return (int) (((float) x / y) * 100);
    }

    public static int factorial(int factorialCount) {
        if (factorialCount == 1) {
            return 1;
        }
        return factorialCount * factorial(factorialCount - 1);
    }

    public static boolean simpleNumber(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }


}
