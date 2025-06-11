package com.java;
import java.util.Scanner;

public class MINI_PROJECT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber;

        do {
            System.out.println("Guess Any Number : ");
             userNumber = sc.nextInt();

            if(userNumber == myNumber){
            System.out.println("It's a Correct Number !!");
            break;
        }
        else if(userNumber > myNumber) {
            System.out.println("Your Number Is Too Large");
        }
        else {
            System.out.println("Your Number Is Too Small");
        }
    } while (userNumber >= 0);

    System.out.println("My Number Was : ");
    System.out.println(myNumber);

    sc.close();
}
}