
//   temp = arr[j-1];
//   arr[j-1] = arr[j];
//   arr[j] = temp;



package prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*class Employee{
    static int emp_id=0;
    String emp_name;
    Employee(String emp_name){
        this.emp_name=emp_name;
        System.out.println("hello");
        emp_id++;
    }
    void showData(){
        System.out.println(emp_name);
        System.out.println(emp_id);
    }
}*/
class Employee implements Comparable<Employee>{
    int age;
    int salary;
    String name;

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {

        return this.name;
    }
    public int getAge() {

        return this.age;
    }
    public int getSalary() {

        return this.salary;
    }
    @Override
    public String toString() {

        return " [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
    @Override
    public int compareTo(Employee o) {
        int compare=Integer.compare(age,o.age);
        return compare;
    }
}
   /* class AgeComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.getAge() - emp2.getAge();
        }
    }

    class SalaryComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.getSalary() - emp2.getSalary();
        }
    }

    class NameComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.getName().compareTo(emp2.getName());
        }
    }
*/
class general {
    public static void main(String args[]) {
        /*Employee e1=new Employee("Sudhir");
        e1.showData();
        Employee e2=new Employee("aniruddha");
        e2.showData();
        Employee e3=new Employee("sneha");
        e3.showData();*/
        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee("Sachin", 45, 25000));
        empList.add(new Employee("Kohli", 34, 35000));
        empList.add(new Employee("Dhoni", 40, 30000));
        System.out.println(empList);
        Collections.sort(empList);
        for (Employee x:empList) {
            System.out.println(x.getName() + " " + x.getAge() + " " + x.getSalary());
        }
        /*Collections.sort(empList, new AgeComparator());
        for (Employee employee : empList) {
            System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getSalary());
        }

        Collections.sort(empList, new SalaryComparator());
        for (Employee employee : empList) {
            System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getSalary());
        }
        Collections.sort(empList, new NameComparator());
        for (Employee employee : empList) {
            System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getSalary());
        }*/
    }
}

