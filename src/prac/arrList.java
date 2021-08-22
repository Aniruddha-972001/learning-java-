package prac;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}
public class arrList {
    public static void main(String args[]){
        Student s1=new Student(1,"AAA",13);
        Student s2=new Student(2,"BBB",14);
        Student s3=new Student(3,"CCC",15);
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            if(st.rollno==1) {
                System.out.println(st.name);
            }
            //System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
