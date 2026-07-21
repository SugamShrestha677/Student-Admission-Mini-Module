package builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import builder.good.Student;

public class StudentBuilderTest {

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

    // Test 1: Verify Student object is created successfully
    @Test
    void testStudentCreated() {
        assertNotNull(student);
    }

    // Test 2: Verify student ID
    @Test
    void testStudentId() {
        assertEquals(101, student.getStudentId());
    }

    // Test 3: Verify student name
    @Test
    void testStudentName() {
        assertEquals("Ram", student.getName());
    }

    // Test 4: Verify department
    @Test
    void testDepartment() {
        assertEquals("BCA", student.getDepartment());
    }

    // Test 5: Verify semester
    @Test
    void testSemester() {
        assertEquals(5, student.getSemester());
    }

    // Test 6: Verify email
    @Test
    void testEmail() {
        assertEquals("ram@gmail.com", student.getEmail());
    }

    // Test 7: Verify phone number
    @Test
    void testPhoneNumber() {
        assertEquals("9800000000", student.getPhoneNumber());
    }

    // Test 8: Verify address
    @Test
    void testAddress() {
        assertEquals("Kathmandu", student.getAddress());
    }

    // Test 9: Verify guardian name
    @Test
    void testGuardianName() {
        assertEquals("Hari", student.getGuardianName());
    }

}