package facade.good;

import builder.good.Student;

public class FacadeDemo {

    public static void main(String[] args) {

        Student student = new Student.StudentBuilder()
                .studentId(101)
                .name("Ram")
                .email("ram@gmail.com")
                .phoneNumber("9800000000")
                .department("BCA")
                .semester(5)
                .address("Kathmandu")
                .guardianName("Hari")
                .build();

        StudentRegistrationFacade facade =
                new StudentRegistrationFacade();

        facade.register(student);

    }

}