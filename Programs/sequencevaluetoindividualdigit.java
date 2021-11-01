Write a Java program to break an integer into a sequence of individual digits. 

Test Data

Input six non-negative digits: 123456

Expected Output :

1 2 3 4 5 6
  
  package com.company;


import java.util.Collection;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int ii=123456;
        String s=Integer.toString(ii);
        System.out.println(ii);
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        for (char c : ch) {
            System.out.println(c+" ");
        }
    }



}
