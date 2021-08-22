package hw;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;
class course {
    public boolean id;
    String c_n;
    int c_id;
    String sub;
    String c_desc;
    int price;
    String auth_name;
    course(String c_n, int c_id,String sub,String c_desc,int price,String auth_name){
        this.c_n=c_n;
        this.c_id=c_id;
        this.sub=sub;
        this.c_desc=c_desc;
        this.price=price;
        this.auth_name=auth_name;
    }
    public void getData(){
        System.out.println("Course name: " + this.c_n + " , id: " + this.c_id + " , subject: " + this.sub + " , Description: " + this.c_desc + " , Price: " + this.price + " , Author: " + this.auth_name);
    }
    @Override
    public String toString() {
        return " [name=" + c_n + ", id=" + c_id + ", subject=" + sub + ", description=" + c_desc + ", price=" + price + ", author=" + auth_name + "]";
    }
}
public class q1 {
    static void print(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select one option from this list give below:");
        System.out.println("1. Create Course");
        System.out.println("2. Show Single Course Details");
        System.out.println("3. Show Courses List");
        System.out.println("4. Create Student");
        System.out.println("5. Show Single Student Details");
        System.out.println("6. Show Students List");
        System.out.println("7. Assign Student to Course");
        System.out.println("8. Search Course By ID");
        System.out.println("9. Search Student By Name");
        System.out.println("10. exit");
    }
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Please Enter Your Name :");
        String name = SC.nextLine();
        System.out.println("Welcome " + name);
        ArrayList<course> courses=new ArrayList<>();
        int op;
        do {
            print();
            System.out.println("Enter the option number: ");
            op = SC.nextInt();
            switch (op) {
                case 1:
                    System.out.println("1. Enter Course Name :");
                    String c_n = SC.next();
                    System.out.println("2. Enter Course Id :");
                    int c_id = SC.nextInt();
                    System.out.println("3. Enter Which Subject this Course Belongs to: ");
                    String sub = SC.next();
                    System.out.println("4. Enter Price for this Course: ");
                    int price = SC.nextInt();
                    System.out.println("5. Enter Course Description: ");
                    String c_desc = SC.next();
                    System.out.println("6. Enter Course Author Name: ");
                    String auth_name = SC.next();
                    System.out.println("details: ");
                    course course_info= new course(c_n,c_id,sub,c_desc,price,auth_name);
                    courses.add(course_info);
                    course_info.getData();
                    break;
                case 2:
                    System.out.println("select the options:");
                    System.out.println("1. print list according to ascending or descending");
                    System.out.println("2. print the full list of courses");
                    int op1=SC.nextInt();
                    switch (op1){
                        case 1:
                            System.out.println("Enter ascending(1) or descending(2): ");
                            int op2=SC.nextInt();
                            /*switch (op2){
                                case 1:

                            }
                            break;
                            }
                            break;
                        default:
                            System.out.println("wrong input");
                            break;*/
                    }
                    break;
                case 10:
                    exit(1);
                    break;
                default:
                    System.out.println("Wrong input ");
                    break;
            }
            System.out.println("enter option(press 0 for main menu):");
            op=SC.nextInt();
        } while (op!=10);
    }
}
