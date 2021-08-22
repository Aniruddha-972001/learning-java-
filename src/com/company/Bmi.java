package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bmi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight: ");
        float w=sc.nextFloat();
        System.out.println("Enter height: ");
        float h=sc.nextFloat();
        float bmi= w/(h*h);
        if(bmi<18.5){
            System.out.println("you are under weight");
        }
        else if(bmi>18.5 && bmi<25){
            System.out.println("you are normal weight");
        }
        else if(bmi>25 && bmi<30){
            System.out.println("you are over weight");
        }
        else{
            System.out.println("you are obese");
        }

    }
}
//x<18.5	Underweight
//   18.5 < x < 25	Normal Weight
//   25 < x < 30	Overweight
//  x>30	Obese