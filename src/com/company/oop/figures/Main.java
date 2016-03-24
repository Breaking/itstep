package com.company.oop.figures;

import java.util.Random;

/**
 * Created by Mike on 24.03.2016.
 */
public class Main {

    public static void main(String[] args){
        Figure[] figures = new Figure[10];
        Random random = new Random();

        for(int i = 0; i < figures.length; i++){
            if(random.nextInt(1000) < 500){
                figures[i] = new Circle(random.nextInt(10));
            } else {
                figures[i] = new Square(random.nextInt(10));
            }
        }

        for (int i = 0; i < figures.length; i++){
            System.out.print(i + 1 + ". " +figures[i].toString());
            if (figures[i] instanceof Square){
                System.out.print(" diagonal = " + ((Square)figures[i]).calculateDiagonal());
            }
            System.out.println();
        }

    }
}
