package student.list.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentListExample {

    public static void main(String[] args)  {
        Scanner k = new Scanner(System.in);
        LinkedList <Student> studentList = new LinkedList<Student>();
        boolean isMore = true;
        while(isMore){
             System.out.println("Type in student number");
            Student one = new Student(k.nextInt());
            System.out.println("Type in a student mark");
            one.setMark(k.nextInt());
            studentList.add(one);
            System.out.println("Do you wish to proceed to another student (press 1 to proceed)?");
            if(k.nextInt()!=1)
                isMore=false;
        }
        try{
        FileWriter fw = new FileWriter("student.dat");
        BufferedWriter bw = new BufferedWriter(fw);
        Iterator <Student> one = studentList.iterator();
        while(one.hasNext()){
            Student two = one.next();
            String record = two.getNumber()+ ", " + two.getStatus();
            bw.write(record);
            bw.newLine();
        }
        bw.close();
        fw.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
