package facade.good;

import builder.good.Student;
import factory.good.Notification;
import factory.good.NotificationFactory;

public class StudentRegistrationFacade {

    private ValidationService validationService;
    private RollNumberService rollNumberService;
    private StudentRepository studentRepository;
    private DepartmentService departmentService;

    public StudentRegistrationFacade() {

        validationService = new ValidationService();
        rollNumberService = new RollNumberService();
        studentRepository = new StudentRepository();
        departmentService = new DepartmentService();

    }

    public void register(Student student) {

        validationService.validate(student);

        rollNumberService.generate(student);

        studentRepository.save(student);

        departmentService.assign(student);

        Notification notification =
                NotificationFactory.createNotification("EMAIL");

        notification.send("Registration Successful");

    }

}