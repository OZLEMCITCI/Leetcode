package interview.Coursera;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Course {

    private  HashMap<Integer,Student>studentMap =new HashMap<>();
    private HashMap<Integer, Assigment> assigmentMap=new HashMap<>();

    public  void addStudent(int studentId){
        if(studentMap.containsKey(studentId)){
            throw new RuntimeException("The given id is already taken");
        }else{
            Student student=new Student(studentId);
            studentMap.put(studentId,student);
        }
    }

    public void addNewAssigment(int assigmentId){
        if(assigmentMap.containsKey(assigmentId)){
            throw new RuntimeException("The given assigment id is already taken");
        }else{
            Assigment assigment=new Assigment(assigmentId);
            assigmentMap.put(assigmentId,assigment);
        }
    }

    public void addGrade(int studentId,int assigmentId,int grade){
        if(!studentMap.get(studentId).gradeMap.containsKey(assigmentId)){
            throw new RuntimeException("The given assigment id is not exist");
        }else{
            studentMap.get(studentId).gradeMap.put(assigmentMap.get(assigmentId),grade);
        }
    }

    public double findAvrageGrade(int studentId){
        if (studentMap.get(studentId).gradeMap.isEmpty()) {
            throw new IllegalStateException("No grades to average");
        }

        double sum = studentMap.get(studentId).gradeMap.values().stream().mapToInt(Integer::intValue).sum();
        return sum / assigmentMap.size();
    }

    public class Assigment{
        private int assigmentId;

        public Assigment(int assigmentId ){
            this.assigmentId=assigmentId;
        }

        public long getAssigmentId() {
            return assigmentId;
        }

        public void setAssigmentId(int assigmentId) {
            this.assigmentId = assigmentId;
        }

    }
    public class Student{
        private int studentId;
        private HashMap<Assigment,Integer> gradeMap;

        public Student (int id){
            this.studentId=id;
            gradeMap =new HashMap<>();
        }
    }

}


