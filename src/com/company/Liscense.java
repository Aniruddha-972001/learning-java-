package com.company;
import java.util.Scanner;


public class Liscense {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        String code=s.nextLine();
        if(code.matches("^[A-Z]([,-]|\\s)?[0-9]{2}([,-]|\\s)?[0-9]{4}$"))
            System.out.println(code+ " is valid");
        else
            System.out.println(code+ " is invalid");
    }
}
