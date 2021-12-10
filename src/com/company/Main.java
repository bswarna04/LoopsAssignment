package com.company;

public class Main {

    public static void main(String[] args) {
	/*for (int i=1;i<=10;i++){                       //For loop
        System.out.println(i);
    }*/
      /*  int i=0;
        while(i<=100){
            System.out.println(i);                   //while loop
            i=i+10;
        }*/
       /* int i=1;
        do {
            System.out.println(i);
            i++;                                  // do while

        }while(i<=10); */

        /*for(int i=1; i<=100;i++){
            if (i%5==0) {                     //for with continue
                if (i >= 25 && i <= 75) {
                    continue;
                }System.out.println(i);
            }*/

           /* for(int i=1; i<=100;i++){
                if (i%5==0) {                       //for with break
                    if (i >50) {
                        break;
                    }System.out.println(i);
                }*/
             /* for(int i=1;i<=2;i++){
                  System.out.println("week"+i);
                  for(int j=1; j<=7;j++){           //nested for loop
                      System.out.println( j);
                  }*/


             /*   int j = 0;
                int k = 0;
                for (int i = 10; i <= 200; i++) {
                    j = i;
                    k=0;
                    while (j != 0) {
                        int rem = j % 10;        //Palindrome numbers between 1 and 200
                        j =j/10;
                        k = k * 10 + rem;
                    }
                    if (i == k )
                        System.out.print(i + " ");
                }*/

      /*  int num1 = 0, num2 = 1;
        for (int i = 0; i <= 50; i++) {
            if(num2<50) {
                int sumOfPrevTwo = num1 + num2;      //Fibonacci sequence
                num1 = num2;
                num2 = sumOfPrevTwo;
                System.out.println(num1);
            }
        }*/
        for (int i = 1; i <= 3; i++) {              //print inner loop of for loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner loop: i: " + i + ", j: " + j);

            }
        }
    }
}


