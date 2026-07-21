package admission;

import builder.good.Student;
import factory.good.Notification;
import factory.good.NotificationFactory;
import singleton.good.CollegeConfig;

public class StudentAdmissionService {

    public void admitStudent(Student student, String notificationType) {

        // Singleton
        CollegeConfig config = CollegeConfig.getInstance();

        System.out.println("\n========== STUDENT ADMISSION ==========");
        System.out.println("College : " + config.getCollegeName());
        System.out.println("Version : " + config.getSystemVersion());

        System.out.println("\nStudent Details");
        System.out.println(	"------------------------");
        System.out.println("Student ID : " + student.getStudentId());
        System.out.println("Name       : " + student.getName());
        System.out.println("Department : " + student.getDepartment());
        System.out.println("Semester   : " + student.getSemester());
        System.out.println("Email      : " + student.getEmail());
        System.out.println("Phone      : " + student.getPhoneNumber());
        System.out.println("Address    : " + student.getAddress());
        System.out.println("Guardian   : " + student.getGuardianName());

        Notification notification =
                NotificationFactory.createNotification(notificationType);

        notification.send("Welcome " + student.getName() +
                " to " + config.getCollegeName());

        System.out.println("\nAdmission Completed Successfully.");
    }

}