package com.company;

import java.util.Scanner;

public class seq {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = sc.nextInt();
        System.out.println(n);
        while(n!=1){
            if(n%2==0){
                n =n/2;
            }
            else{
                n=(n*3)+1;
            }
            System.out.println(n);
        }
    }
}
