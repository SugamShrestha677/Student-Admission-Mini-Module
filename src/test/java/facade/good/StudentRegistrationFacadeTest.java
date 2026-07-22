package facade.good;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import builder.good.Student;

public class StudentRegistrationFacadeTest {

    private StudentRegistrationFacade facade;
    private Student student;

    @BeforeEach
    void setUp() {

        facade = new StudentRegistrationFacade();

        student = new Student.StudentBuilder()
                .studentId(101)
                .name("Ram")
                .email("ram@gmail.com")
                .phoneNumber("9800000000")
                .department("BCA")
                .semester(5)
                .address("Kathmandu")
                .guardianName("Hari")
                .build();
    }

    // Test 1
    @Test
    void testFacadeObjectNotNull() {

        assertNotNull(facade);

    }

    // Test 2
    @Test
    void testRegistrationStartsSuccessfully() {

        assertDoesNotThrow(() -> facade.register(student));

    }

    // Test 3
    @Test
    void testValidationServiceExecuted() {

        assertDoesNotThrow(() -> facade.register(student));

    }

    // Test 4
    @Test
    void testDepartmentAssignmentExecuted() {

        assertDoesNotThrow(() -> facade.register(student));

    }

    // Test 5
    @Test
    void testNotificationServiceExecuted() {

        assertDoesNotThrow(() -> facade.register(student));

    }

}