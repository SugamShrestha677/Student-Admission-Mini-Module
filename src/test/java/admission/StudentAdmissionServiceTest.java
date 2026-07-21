package admission;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import builder.good.Student;

public class StudentAdmissionServiceTest {

    private final Student student = new Student.StudentBuilder()
            .studentId(101)
            .name("Ram")
            .email("ram@gmail.com")
            .phoneNumber("9800000000")
            .department("BCA")
            .semester(5)
            .address("Kathmandu")
            .guardianName("Hari")
            .build();

    @Test
    void testAdmissionWithEmailNotification() {

        StudentAdmissionService service = new StudentAdmissionService();

        assertDoesNotThrow(() ->
                service.admitStudent(student, "EMAIL"));
    }

    @Test
    void testAdmissionWithSMSNotification() {

        StudentAdmissionService service = new StudentAdmissionService();

        assertDoesNotThrow(() ->
                service.admitStudent(student, "SMS"));
    }

    @Test
    void testAdmissionWithPushNotification() {

        StudentAdmissionService service = new StudentAdmissionService();

        assertDoesNotThrow(() ->
                service.admitStudent(student, "PUSH"));
    }

}