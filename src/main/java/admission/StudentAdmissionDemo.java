package admission;

import java.util.Scanner;

import builder.good.Student;

public class StudentAdmissionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== PCPS College Admission ==========");

        System.out.print("Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Department: ");
        String department = sc.nextLine();

        System.out.print("Semester: ");
        int semester = sc.nextInt();
        sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("Guardian Name: ");
        String guardian = sc.nextLine();

        Student student = new Student.StudentBuilder()
                .studentId(id)
                .name(name)
                .email(email)
                .phoneNumber(phone)
                .department(department)
                .semester(semester)
                .address(address)
                .guardianName(guardian)
                .build();

        System.out.println();

        System.out.println("Notification Type");
        System.out.println("1. EMAIL");
        System.out.println("2. SMS");
        System.out.println("3. PUSH");

        System.out.print("Choose: ");

        int choice = sc.nextInt();

        String notificationType;

        switch (choice) {

            case 1:
                notificationType = "EMAIL";
                break;

            case 2:
                notificationType = "SMS";
                break;

            case 3:
                notificationType = "PUSH";
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        StudentAdmissionService service = new StudentAdmissionService();

        service.admitStudent(student, notificationType);

        sc.close();
    }

}