package com.company.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Mike on 25.02.2016.
 */
public class ExampleSortByYear {
    public static void main(String[] args) throws IOException {
        String[] names = {"name4", "", "name2", "name3", "name1"};
        int[] y = {1965, 0, 1965, 3456, 7764};
        int[] m = {1, 0, 3, 4, 5};
        int[] d = {1, 0, 3, 12, 22};
        boolean[] ids = {true, false, true, true, true};

        int minI = 0;
        String[] namesSearch = new String[ids.length];
        int k = 0;

        for(int i = 0; i < ids.length; i++) {
            if (ids[i]) {
                for (int i1 = 0; i1 < ids.length; i1++) {
                    if (ids[i1] && !findIn(dateToString(y[i1], m[i1], d[i1]), namesSearch)) {
                        minI = i1;
                        break;
                    }
                }


                for (int j = 0; j < ids.length; j++) {
                    if (ids[j] && !findIn(dateToString(y[j], m[j], d[j]), namesSearch) &&
                            dateToString(y[j], m[j], d[j]).
                                    compareTo(dateToString(y[minI], m[minI], d[minI])) <= 0) {
                        minI = j;
                    }
                }
                namesSearch[k] = dateToString(y[minI], m[minI], d[minI]);
                k++;
                System.out.println(minI + " " + names[minI] + " " + dateToString(y[minI], m[minI], d[minI]));
            }
        }

        saveToFile(names, "filenames");

    }

    public static void saveToFile(String[] m, String filename) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
        objectOutputStream.writeObject(m);
        objectOutputStream.close();


    }

    public static boolean findIn(String s, String[] m){
        for(int i = 0; i < m.length; i++){
            if (s.equals(m[i])) {
                return true;
            }
        }
        return false;
    }

    public static String dateToString(int y, int m, int d){
        String s = y+"-";
        if (String.valueOf(m).length() == 1){
            s += "0";
        }
        s += m + "-";

        if (d < 10){
            s += "0";
        }

        s += d;
        return s;
    }
}
