package interview.verisk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

////Implememnt a student registartion and student information retrival system for a school using a simple class roster in Java.
// When a student is register, the system must assign an integer id(enrolmentNumber) number statrting at 1 as each student is register.
// The students's name is stored with the assigned id number
// The retrival request should return a student registaration information . The student classs should implement -
// the construntor.Student(String name) - The method String toString() to return the "{enrollmentNumber:{name}
public class StudentA {
    ///A roster
    //id ---> start from 1
    //Name
    //Registration information
    //

    private static Map<Integer,StudentA> roster=new HashMap<>();
    private static int counter=1;
    private int id;

    private String studentName;

    public StudentA(String studentName) {
        id=counter++;
        this.studentName = studentName;
        roster.put(id,this);
    }

    public StudentA getStudent(int id){
       return roster.get(id);

    };

    public String toString(){
        return '{'+this.id+'}'+"{"+this.studentName+"}";
    };




}
