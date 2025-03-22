package com.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 20),
                new Student("Bob", 18),
                new Student("Charlie", 22)
        );
        /*students.stream()
                .sorted(new Comparator<Student>() {

                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getAge()-o2.getAge();
                    }
                })
                .forEach(System.out::println);*/
        students.stream()
                .sorted((s1, s2) -> s1.getAge() - s2.getAge())
                .forEach(System.out::println);
    }
}
