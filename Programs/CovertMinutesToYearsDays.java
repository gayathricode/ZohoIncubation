/*Write a Java program to convert minutes into number of years and days. 

Test Data

Input the number of minutes: 3456789

Expected Output :

3456789 minutes is approximately 6 years and 210 days*/

package com.company;


import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int minutes=3456789;
        int hours =minutes/60;
        int day = hours/24;
        int year= day/365;
        day = day%365;
        System.out.println("Total years "+year);
        System.out.println("Total days "+day);


    }
}
