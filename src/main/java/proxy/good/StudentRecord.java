package proxy.good;

public class StudentRecord implements StudentRecordService {

    @Override
    public void viewMarks() {

        System.out.println("Student Marks: 85");

    }

}