package decorator.bad;

public class DecoratorBadDemo {

    public static void main(String[] args) {

        StudentReport report = new PDFStudentReport();

        report.generate();

    }

}