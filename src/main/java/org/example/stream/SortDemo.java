package org.example.stream;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println(fruits);
        System.out.println("Using Stream and Sort");
        List<String> sorted = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);
        List<String> sorted1 = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sorted1);
        System.out.println("Using Lambda expression to sort");
        List<String> sorted2 = fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(sorted2);

        //In Descending Order
        System.out.println("Using Stream and Sort descending order");
        List<String> sorted3 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sorted3);
        System.out.println("Using Lambda expression to sort descending order");
        List<String> sorted4 = fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(sorted4);

        //Sort Employee Salary
        List<Employee>employees = new ArrayList<>();
        employees.add(new Employee(1,"Rahul",25000));
        employees.add(new Employee(3,"Zain",50000));
        employees.add(new Employee(2,"Amey",35000));
        employees.forEach(System.out::println);
        // Using Comparator method
//        List<Employee> reslist = employees.stream().sorted(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getSalary() - o2.getSalary();
//            }
//        }).collect(Collectors.toList());
//        reslist.forEach(System.out::println);
        //Using Lambda Expressions
//        List<Employee> reslist = employees.stream()
//                .sorted((Employee o1, Employee o2) -> o1.getSalary() - o2.getSalary())
//                .collect(Collectors.toList());
//        reslist.forEach(System.out::println);
//        // descending order
//        List<Employee> reslist1 = employees.stream()
//                .sorted((Employee o1, Employee o2) -> o2.getSalary() - o1.getSalary())
//                .collect(Collectors.toList());
//        reslist1.forEach(System.out::println);
        // Using Method Reference in sorted method
        List<Employee> reslist2 = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .collect(Collectors.toList());
        reslist2.forEach(System.out::println);
        // Descending order
        List<Employee> reslist3 = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        reslist3.forEach(System.out::println);
        // Sorting name
        System.out.println("Sorting with Name: ");
        List<Employee> reslist4 = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        reslist4.forEach(System.out::println);



    }

}
