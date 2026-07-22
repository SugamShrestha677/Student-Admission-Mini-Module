package decorator.good;

public class StudentReport implements Report {

    @Override
    public void generate() {

        System.out.println("Student Report Generated.");

    }

}