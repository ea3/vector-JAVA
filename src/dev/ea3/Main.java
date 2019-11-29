package dev.ea3;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 8282));
        employeeList.add(new Employee("Lucas", "Tundre", 5573));
        employeeList.add(new Employee("Pete", "limber", 1127));
        employeeList.add(new Employee("Silvia", "Lis", 44772));

    }
}
