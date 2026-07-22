package decorator.good;

public class PDFDecorator extends ReportDecorator {

    public PDFDecorator(Report report) {
        super(report);
    }

    @Override
    public void generate() {

        report.generate();

        System.out.println("PDF Generated.");

    }

}