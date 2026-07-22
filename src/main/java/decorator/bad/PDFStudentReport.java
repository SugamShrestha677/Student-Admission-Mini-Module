package decorator.bad;

public class PDFStudentReport extends StudentReport {

    @Override
    public void generate() {

        super.generate();

        System.out.println("PDF Generated.");

    }

}