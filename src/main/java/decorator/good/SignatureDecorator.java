package decorator.good;

public class SignatureDecorator extends ReportDecorator {

    public SignatureDecorator(Report report) {
        super(report);
    }

    @Override
    public void generate() {

        report.generate();

        System.out.println("Digital Signature Added.");

    }

}