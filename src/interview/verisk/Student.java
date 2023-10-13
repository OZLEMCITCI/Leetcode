package interview.verisk;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    private long id;
    public String name;
    private int grade;
    private String department;

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    private int age;
    private List<Integer> grades;

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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {

    }
    public static List<Student> deleteStudentByName(List<Student> students,String name){
        students.removeIf(student->student.name.equals(name));
        return students;
    }

    public static Map<Integer,List<String>> groupStudentsByGrade(List<Student>list){

        return list.stream()
                .collect(Collectors.groupingBy(Student::getGrade,Collectors.mapping(Student::getName,Collectors.toList())));

    };


    //Given a list of students (with properties like name, age, and grades),
    //write a method that will return a list of student names who are above a certain age and
    //whose average grade is above a certain threshold.
    public List<String> getQualifiedStudents(List<Student> students, int ageThreshold, int gradeThreshold) {
        return students.stream()
                .filter(student -> student.getAge() >= ageThreshold)
                .filter(student -> !student.getGrades().isEmpty())
                .filter(student -> student.getGrades().stream().mapToInt(Integer::intValue).average().orElse(0) >= gradeThreshold)
                .map(Student::getName)
                .collect(Collectors.toList());

    }

    public Map<Integer,Long> groupByAge(List<Student>students){
        return students.stream().collect(Collectors.groupingBy(Student::getAge,Collectors.counting()));
    }


//    Given a list of Students again, where each Student has a name, age, and grade as properties,
//    write a method that groups students by grade. However, this time, instead of returning a list of students
//    in each department, return a
//    LinkedHashMap where the key is the department and the value is the count of students in that department.

    public LinkedHashMap<String,Long> groupByDepartment(List<Student>students){
        return students.stream().collect(Collectors.groupingBy(Student::getDepartment,LinkedHashMap::new,Collectors.counting()));
    }

    public LinkedHashMap<Integer,Long> groupByGrade(List<Student>students){
        return students.stream().collect(Collectors.groupingBy(Student::getGrade,LinkedHashMap::new,Collectors.counting()));
    }

}
