package file;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class FileHandling {
    public static void main(String args[]) throws FileNotFoundException {
        File f=new File("C:\\Users\\DELL\\Desktop\\file\\my-file.txt");
        Scanner sc = new Scanner(f);
        ArrayList<String> arr1= new ArrayList<String>();
        while(sc.hasNext()){
            arr1.add(sc.nextLine());
        }
        HashMap<String,ArrayList<String>> arr2=new HashMap<String,ArrayList<String>>();
        for(int i=0;i< arr1.size();i++) {
            String s = arr1.get(i);
            int index = s.indexOf("_");
            String subString = null;
            if (index != -1) {
                subString = s.substring(0, index);
            } else {
                continue;
            }
            //System.out.println(subString);
            long ts = Long.parseLong(subString);
            int length = String.valueOf(ts).length();
            if (length < 13) {
                ts = ts * 1000;
            } else {
                continue;
            }
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String output = df.format(ts);
            if(arr2.containsKey(output)){
                arr2.get(output).add(s);
            }
            else {
                arr2.put(output,new ArrayList<>());
                arr2.get(output).add(s);
            }
        }
        System.out.println(arr2);
        sc.close();
    }
}
