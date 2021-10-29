/*3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 

Test Data

Input an integer between 0 and 1000: 565

Expected Output :

The sum of all digits in 565 is 16 */

package com.company;


import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int n=565;
        int sum= 0;
        while(n>0){
            int reminder =n%10;
            sum=sum+reminder;
            n=n/10;
        }
        System.out.println("given value is "+sum);

    }
}
