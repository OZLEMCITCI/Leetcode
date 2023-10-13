package interview.Coursera;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseWithHashMap {

    List<Integer> assigmentList=new ArrayList<>();
    Map<Integer, Map<Integer,Integer>> map=new HashMap<>();
    public  void addStudent(int studentId){
       if(map.containsKey(studentId)){
           System.out.println("there is already student with this id");
       }else{
           map.put(studentId,new HashMap<>());
       }
    }

    public void addNewAssigment(int assigmentId){
        if(!assigmentList.contains(assigmentId)){
            System.out.println("there is already assigment with this id");
        }else{
            assigmentList.add(assigmentId);
        }
    }

    public void addGrade(int studentId,int assigmentId,int grade){
      if(!map.get(studentId).containsKey(assigmentId)){
          System.out.println("there is no assigment with this id");
      }else{
          map.get(studentId).replace(assigmentId,grade);
      }
    }

    public double findAvrageGrade(int studentId){
      return map.get(studentId).values().stream().mapToInt(Integer::intValue).sum()/map.get(studentId).values().size();
    }
}
