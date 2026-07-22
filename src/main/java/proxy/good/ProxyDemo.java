package proxy.good;

public class ProxyDemo {

    public static void main(String[] args) {

        StudentRecordService admin =
                new StudentRecordProxy("ADMIN");

        admin.viewMarks();

        System.out.println();

        StudentRecordService student =
                new StudentRecordProxy("STUDENT");

        student.viewMarks();

    }

}