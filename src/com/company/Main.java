package com.company;
import java.util.Locale;
import java.util.Scanner;           //used when to want to take user input using scanner method
//in any java program u always have a default function
//use of static is we can run the function without creating the object
// we use PascalConvention for classes
// we use camelCaseConvention for functions
// boolean default value is false
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");
    //input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1:");
        int a =sc.nextInt();
        System.out.println("enter number 2: ");
        int b = sc.nextInt();
        int sum =a+b;
        System.out.println("sum is ");
        System.out.println(sum);
    //string methods
        //converting to lower case
        String name ="JACK PARKER";
        name=name.toLowerCase();
        System.out.println(name);
        //replacing space with _
        String text="to lower case";
        text=text.replace(" ","_");
        System.out.println(text);

    }
}
