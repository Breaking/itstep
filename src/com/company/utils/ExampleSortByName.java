package com.company.utils;

/**
 * Created by Mike on 25.02.2016.
 */
public class ExampleSortByName {
    public static void main(String[] args){
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
                    if (ids[i1] && !findIn(names[i1], namesSearch)) {
                        minI = i1;
                        break;
                    }
                }


                for (int j = 0; j < ids.length; j++) {
                    if (ids[j] && !findIn(names[j], namesSearch) && names[j].compareTo(names[minI]) <= 0) {
                        minI = j;
                    }
                }
                namesSearch[k] = names[minI];
                k++;
                System.out.println(minI + " " + names[minI] + " " + y[minI]);
            }
        }

    }

    public static boolean findIn(String s, String[] m){
        for(int i = 0; i < m.length; i++){
            if (s.equals(m[i])) {
                return true;
            }
        }
        return false;
    }
}
