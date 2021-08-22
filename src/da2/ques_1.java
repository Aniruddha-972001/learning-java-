package da2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ques_1 {
    public static void main(String args[]){
        File myFile = new File("da.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
        try {
            String longestWord = "";
            String current;
            Scanner sc = new Scanner(myFile);
            while(sc.hasNext()){
                current = sc.next();
                if (current.length() > longestWord.length()) {
                    longestWord = current;
                }
            }
            System.out.println("longestWord: "+ longestWord);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            String shortestWord="";
            String current="";
            Scanner sc = new Scanner(myFile);
            shortestWord=sc.next();
            while(sc.hasNext()){
                current = sc.next();
                if (current.length() <= shortestWord.length()) {
                    shortestWord = current;
                }
            }
            System.out.println("last shortest word: "+ shortestWord);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
