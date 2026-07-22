package facade.bad;

import builder.good.Student;
import factory.good.Notification;
import factory.good.NotificationFactory;

public class RegistrationBadDemo {

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

        ValidationService validation = new ValidationService();
        validation.validate(student);

        RollNumberService roll = new RollNumberService();
        roll.generate(student);

        StudentRepository repository = new StudentRepository();
        repository.save(student);

        DepartmentService department = new DepartmentService();
        department.assign(student);

        Notification notification =
                NotificationFactory.createNotification("EMAIL");

        notification.send("Registration Successful");

    }

}