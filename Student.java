package student.list.example;

public class Student {
    private int number;
    private int mark;
    private String status;
    public Student(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
    public String getStatus(){
        calculateStatus();
        return status;
    }
    private void calculateStatus(){
        if (mark < 50)
            status = "failed";
        else
            status="passed";
    }
}
