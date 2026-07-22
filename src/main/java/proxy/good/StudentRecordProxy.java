package proxy.good;

public class StudentRecordProxy implements StudentRecordService {

    private StudentRecord studentRecord;
    private String role;

    public StudentRecordProxy(String role) {

        this.role = role;
        this.studentRecord = new StudentRecord();

    }

    @Override
    public void viewMarks() {

        if (role.equalsIgnoreCase("ADMIN")) {

            studentRecord.viewMarks();

        } else {

            System.out.println("Access Denied.");

        }

    }

}