package facade.bad;

import builder.good.Student;

public class StudentRepository {

    public void save(Student student) {
        System.out.println("Student saved.");
    }

}