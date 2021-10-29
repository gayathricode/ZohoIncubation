/*Write a Java program that reads a number in inches, converts it to meters. 

Note: One inch is 0.0254 meters.

Test Data

Input a value for inch: 1000

Expected Output :

1000.0 inch is 25.4 meters.*/



package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int value=1000;
        float inch=0.0254f;
        float meter =value*inch;
        System.out.println("The value of meter is "+meter);
    }
}
