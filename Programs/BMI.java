Write a Java program to compute body mass index (BMI). 

Test Data

Input weight in pounds: 452

Input height in inches: 72

Expected Output:

Body Mass Index is 61.30159143458721

package com.company;


public class Main {

    public static void main(String[] args) {
       int a=10;
       int b=5;
       int c=2;
       char condition ='*';
       if(condition == '+'){
           int result = a+b+c;
           System.out.println("sum of a and b and c is "+result);
       }
       else if(condition =='-')
        {
            int result =a-b-c;
            System.out.println("sum of a and b and c is "+result);
        }
       else if(condition =='*') {
            int result = a * b * c;

            System.out.println("sum of a and b and c is "+result);
        }
       else if(condition =='/') {
           int result = a/b/c;

           System.out.println("sum of a and b and c is " +result);
       }

       else if(condition =='%')
       {
        int result = a%b%c;

        System.out.println("sum of a and b and c is " +result);
    }



    }

}




2. LeapYear
package com.company;


public class Main {

    public static void main(String[] args) {
        int leapYear= 2020;
        if(leapYear%4==0){
            System.out.println("Given year is leapYear " +leapYear);
        }
        else {
            System.out.println("Given year not leapYear " +leapYear);
        }


    }}

    Average:
    package com.company;


    public class Main {

        public static void main(String[] args) {
            int English =70;
            int Tamil =70;
            int Maths =70;
            int Science =70;
            int Social =70;
            int average =(English+Tamil+Maths+Science+Social)/5;
            if (average >=50  && average <=60){
                System.out.println(" The student got pass and average is "+average);
            }
            else if (average <50){
                System.out.println(" TThe student failed and average is "+average);
            }
            else if (average >=61 && average <=70){

                System.out.println(" The student passed in Third class and average is "+average);
            }
            else if (average >=71 && average <=80){
            System.out.println(" The student passed in second class and average is "+average);
            }
            else if (average >=81 && average <=90) {
                System.out.println(" The student passed in First class and average is " + average);
            }
            else if (average >=90 && average <=100) {
                System.out.println(" The student passed in Distrinction and average is " + average);
            }

            }


        }









4.


package com.company;


public class Main {

    public static void main(String[] args) {
        int x = 15000;
        int siva= x/3;
        int gayu = x/3;
        int sent = x/3;
        int sivaspend =1000;
        int gayuspend =2000;
        int sentspend =3000;
        int amount = siva-sivaspend;
        System.out.println("siva balance is "+amount);
        amount = gayu-gayuspend;
        System.out.println("gayu balance is "+amount);
        amount = sent-sentspend;
        System.out.println("sent balance is "+amount);
        System.out.println("Siva Bal is "+((x/3)-sivaspend) +"\n"+"Gayu Bal is "+((x/3)-gayuspend) +"\n"+ "Senth Bal is "+((x/3)-sentspend));
    }}

swtich case:
package com.company;


public class Main {

    public static void main(String[] args) {
        int n=199;

        switch(n){
            case 199: {
                System.out.println("one");
                break;
            }
            case 2: {
                System.out.println("two");
                break;
            }
            case 3: {
                System.out.println("threee");
                break;
            }
            case 4: {
                System.out.println("four");
                break;
            }
            case 5: {
                System.out.println("five");
                break;
            }
            case 6: {
                System.out.println("six");
                break;
            }
            default:{
                System.out.println("no case match");
                break;
            }

        }
    }
}

LOOP
Leapyear
public class Main {

    public static void main(String[] args) {

        int year =2001;
        int n =3000;
        for(;year<=3000;year+=1) {
            System.out.println(year);
            if (year%4 ==0){
            System.out.println("The given year is Leap year "+year);
            }
        }
}}

package com.company;


public class Main {

    public static void main(String[] args) {

        int i=0;
        int n =50;
        for(i=1;i<=n;i++) {
            if(i%2==0){
            System.out.println("even "+i);
            }
            else{
            System.out.println("odd "+i);
            }
        }
        i=1;
        n=100;
      for(i=1;i<=n;i++){
          if(i%3==0){
              System.out.println("divided by 3 is "+i);
          }
          else{
              System.out.println("not divided by 3 is "+i);
          }
        }
        i=1;
        n=100;
      for(i=0;i>=n;i-=1)
      }}
public class Main
 {

     public static void main(String[] args)
     {

        int i=100;
        int n=0;
        for(i=100;i>=n;i-=1)
        {
            System.out.println(i);
        }

     }
 }


Scanner input = new Scanner(System.in);
        System.out.println("Enter the : ");
        meter = input.nextInt();
