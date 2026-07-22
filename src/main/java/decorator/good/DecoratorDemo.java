package decorator.good;

public class DecoratorDemo {

    public static void main(String[] args) {

        Report report = new StudentReport();

        report = new PDFDecorator(report);

        report = new WatermarkDecorator(report);

        report = new SignatureDecorator(report);

        report.generate();

    }

}