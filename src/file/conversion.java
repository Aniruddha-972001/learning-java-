package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class conversion {
    public static void main(String args[]) throws FileNotFoundException {
        int ani=100000;
        int length=String.valueOf(ani).length();
        System.out.println(length);


        File file=new File("C:\\Users\\DELL\\Desktop\\file\\my-file.txt");
        Scanner sc=new Scanner(file);
        String s =sc.nextLine();
        int a=s.indexOf("_");
        String subString = null;
        if(a!=-1){
            subString=s.substring(0,a);
        }
        System.out.println(subString);
        long var=1473927075000L;
        System.out.println(var);
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
        String output = sdf.format(var);
        System.out.println(output);
    }
}
