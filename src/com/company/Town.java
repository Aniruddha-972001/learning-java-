package com.company;

public class Town {
    public static void main(String[] args){
        int people=1000;
        double grate=0.1;
        int years=0;
        while(people<30000){
            people *= 1 + grate;
            years ++;
            System.out.println("population is: "+ people +" years: "+ years);
        }
    }
}
