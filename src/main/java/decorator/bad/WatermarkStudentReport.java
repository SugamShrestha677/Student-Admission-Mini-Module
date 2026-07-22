package decorator.bad;

public class WatermarkStudentReport extends StudentReport {

    @Override
    public void generate() {

        super.generate();

        System.out.println("Watermark Added.");

    }

}