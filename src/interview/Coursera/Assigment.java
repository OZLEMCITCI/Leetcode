package interview.Coursera;

public class Assigment {
    private long assigmentId;
    private int grade;

    public Assigment(long assigmentId ){
        this.assigmentId=assigmentId;
    }

    public long getAssigmentId() {
        return assigmentId;
    }

    public void setAssigmentId(long assigmentId) {
        this.assigmentId = assigmentId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
