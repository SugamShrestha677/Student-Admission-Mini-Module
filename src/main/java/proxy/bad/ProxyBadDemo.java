package proxy.bad;

public class ProxyBadDemo {

    public static void main(String[] args) {

        StudentRecord record = new StudentRecord();

        // Anyone can access
        record.viewMarks();

    }

}