package decorator.bad;

public class SignatureStudentReport extends StudentReport {

    @Override
    public void generate() {

        super.generate();

        System.out.println("Digital Signature Added.");

    }

}