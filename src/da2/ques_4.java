package da2;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee {
    private long id;
    private String name;

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Two customers are equal if their IDs are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee customer = (Employee) o;
        return id == customer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ques_4 {
    public static void main(String args[]) {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(101, "Rajeev"));
        employees.add(new Employee(102, "Sachin"));
        employees.add(new Employee(103, "Chris"));

        /*
          HashSet will use the `equals()` & `hashCode()` implementations
          of the Customer class to check for duplicates and ignore them
        */
        employees.add(new Employee(101, "Rajeev"));

        System.out.println(employees);

    }
}
