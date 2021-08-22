package com.company;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a: ");
        float a= sc.nextFloat();
        if(a>0 && a<9){

            float total= a+(a*a)+(a*a*a)+(a*a*a*a);
            System.out.println(total);
        }
        else{
            System.out.println("invalid input ");
        }

    }
}
