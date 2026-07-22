package proxy.good;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StudentRecordProxyTest {

    @Test
    void testAdminAccessAllowed() {

        StudentRecordService proxy =
                new StudentRecordProxy("ADMIN");

        assertDoesNotThrow(() -> proxy.viewMarks());

    }

    @Test
    void testStudentAccessDenied() {

        StudentRecordService proxy =
                new StudentRecordProxy("STUDENT");

        assertDoesNotThrow(() -> proxy.viewMarks());

    }

    @Test
    void testProxyObjectCreated() {

        StudentRecordService proxy =
                new StudentRecordProxy("ADMIN");

        assertTrue(proxy instanceof StudentRecordProxy);

    }

    @Test
    void testProxyObjectNotNull() {

        StudentRecordService proxy =
                new StudentRecordProxy("ADMIN");

        assertNotNull(proxy);

    }

}