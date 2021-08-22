package da2;

import java.util.ArrayList;
import java.util.Collections;

public class ques_3 {
    public static void main(String args[]){
        ArrayList<String> alist=new ArrayList<String>();

        //insertion
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");
        System.out.println("alist is: " + alist);

        //retrieve element  at specific index
        String element= alist.get(2);
        System.out.println("printing 3rd element: " + element);

        //update specific  index element  by the given element
        alist.set(0, "Sam");

        //remove a particular element
        alist.remove("Angela");
        alist.remove(2);

        System.out.println("after updating andd deleting alist: " + alist);

        //sorting
        System.out.println("sorted arr: ");
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");
        Collections.sort(fruits);

        for (String str : fruits) {
            System.out.println(str);
        }
    }
}
