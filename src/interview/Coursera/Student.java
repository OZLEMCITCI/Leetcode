package interview.Coursera;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    private long studentId;
    private HashMap<Long,Assigment> assigmentMap;
    private static HashMap<Long,Student>studentMap =new HashMap<>();

    public Student (long id){
        this.studentId=id;
        assigmentMap =new HashMap<>();
    }

    public static  void addStudent(long studentId){
        if(studentMap.containsKey(studentId)){
            throw new RuntimeException("The given id is already taken");
        }else{
            Student student=new Student(studentId);
            studentMap.put(studentId,student);
        }
    }

    public void addNewAssigment(Long assigmentId){
        if(assigmentMap.containsKey(assigmentId)){
            throw new RuntimeException("The given assigment id is already taken");
        }else{
            Assigment assigment=new Assigment(assigmentId);
            assigmentMap.put(assigmentId,assigment);
        }
    }

    public void addGrade(long assigmentId,int grade){
        if(!assigmentMap.containsKey(assigmentId)){
            throw new RuntimeException("The given assigment id is not exist");
        }else{
            assigmentMap.get(assigmentId).setGrade(grade);
        }
    }

    public double findAvrageGrade(){
        if (assigmentMap.isEmpty()) {
            throw new IllegalStateException("No grades to average");
        }

        List<Integer> LSIT=new ArrayList<>();

        LSIT.stream().filter(x->x<0).count();

        LSIT.stream().mapToInt(Integer::intValue).sum();
        double sum = assigmentMap.values().stream().mapToInt(Assigment::getGrade).sum();
        return sum / assigmentMap.size();
    }

}
