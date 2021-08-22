package com.company;

public class percentage {
    public static void main(String[] args){
        float mat=90;
        float eng=85;
        float hin=89;
        float sci=90;
        float ss=88;
        float total= mat + eng + hin + sci + ss ;
        System.out.println("total marks : "+ total);
        float per= (total*100)/500;
        System.out.println("his percentage: "+ per );
        float avg=total/5;
        System.out.print("the student grade is: ");
        if(avg>=90)
        {
            System.out.print("S");
        }
        else if(avg>=80 && avg<89)
        {
            System.out.print("A");
        }
        else if(avg>=70 && avg<79)
        {
            System.out.print("B");
        }
        else if(avg>=60 && avg<69)
        {
            System.out.print("C");
        }
        else if(avg>=50 && avg<59)
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("the student failed ");
        }
    }
}
