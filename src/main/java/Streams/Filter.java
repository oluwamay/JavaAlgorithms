package Streams;

import java.util.*;
import java.util.stream.Collectors;


public class Filter {
    public static void main(String[] args) {
        Student stud1 = new Student("yoo", 75, Gender.FEMALE);
        Student stud2 = new Student("Saki", 35, Gender.MALE);
        Student stud3 = new Student("Rasheed", 65, Gender.MALE);
        Student stud4 = new Student("Qween", 95, Gender.FEMALE);
        Student stud5 = new Student("Eunice", 61, Gender.FEMALE);
        Student stud6 = new Student("Wendy", 40, Gender.FEMALE);
        Student stud7 = new Student("yisa", 55, Gender.MALE);

        List<Student> StudentList = new ArrayList<>();
        StudentList.add(stud1);
        StudentList.add(stud2);
        StudentList.add(stud3);
        StudentList.add(stud4);
        StudentList.add(stud5);
        StudentList.add(stud6);
        StudentList.add(stud7);

        List<Student> femaleStudents = StudentList.stream()
                .filter(student -> student.gender.equals(Gender.FEMALE)).collect(Collectors.toList());

//      System.out.println(femaleStudents);

        //Sort by score
//        StudentList.stream()
//                .sorted(Comparator.comparing(Student::getScore)).forEach(System.out::println);

        //allMatch checks if every object satisfies the predicated condition
      boolean allMatch = StudentList.stream()
                .allMatch(stud -> stud.getScore() > 60);
//        System.out.println(allMatch);
        //anyMatch checks if any member satisfies the predicate
        boolean anyMatch = StudentList.stream()
                .anyMatch(student -> student.getScore() < 50);
        System.out.println(anyMatch);
        //findAny searches out the object that mathes given condition
        StudentList.stream()
                .findAny();

    }
}
