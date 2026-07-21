package builder.demo;

import builder.good.Student;

public class BuilderDemo {

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

        System.out.println("Student ID : " + student.getStudentId());
        System.out.println("Name       : " + student.getName());
        System.out.println("Email      : " + student.getEmail());
        System.out.println("Phone      : " + student.getPhoneNumber());
        System.out.println("Department : " + student.getDepartment());
        System.out.println("Semester   : " + student.getSemester());
        System.out.println("Address    : " + student.getAddress());
        System.out.println("Guardian   : " + student.getGuardianName());

    }

}