Write a Java program to compute body mass index (BMI). 

Test Data

Input weight in pounds: 452

Input height in inches: 72

Expected Output:

Body Mass Index is 61.30159143458721
  
  package com.company;


import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int pounds=452;
        float weightConversionConstant = 0.453f;
        float weight=pounds*weightConversionConstant;
        int inch =72;
        float heightConstant = 0.0254f;
        float height=inch*heightConstant;
        float BMI=weight/(height*height);
        System.out.println("Total BMI "+BMI);


    }
}
