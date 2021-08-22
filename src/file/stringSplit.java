/*
TOT REC : 123 TOT AMT : 2121
TOT REC:123 TOT AMT:1221
TOT REC : 123
TOT REC:123
TOT REC 123
*/
package file;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringSplit {
    public static void main(String args[]){
        Pattern p = Pattern.compile("[\\d]+");
        Matcher m = p.matcher("TOT REC : 123 TOT AMT : 2121");
        while(m.find()){
            System.out.println(m.group());
        }
        /*String str="TOT REC:123 TOT AMT:1221";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        int index=str.indexOf(" ");
        String subString = null;
        if(index!=-1){
            subString=str.substring(0,index);
        }
        System.out.println(subString);*/
    }
}
