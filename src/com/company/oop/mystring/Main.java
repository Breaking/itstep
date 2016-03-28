package com.company.oop.mystring;

/**
 * Created by Mike on 26.03.2016.
 */
public class Main {
    public static void main(String[] args){
        StringBuffer s = new StringBuffer("0");
        for (int i = 0; i <= 9 ; i++) {
            s.append(i).append(",");
        }

        System.out.println(s);

        MyString myString = new MyString("123");
        boolean result = myString.equals(new MyString("123"));
        System.out.println(result);

        myString.append(new MyString("456")).append(new MyString("789"));
        System.out.println(myString.getString());

        myString = myString.append(new MyString("456"));
        myString = myString.append(new MyString("789"));
        System.out.println(myString.getString());

        myString.append(new MyString("456"));
        myString.append(new MyString("789"));
        System.out.println(myString.getString());

        MyString myString2 = new MyString("1234");
        MyString resultSubstring = myString2.substring(1, 3);

        System.out.println("substring from 1234: " + resultSubstring.getString());


    }
}
