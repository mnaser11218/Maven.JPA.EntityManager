

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    public static void main(String[] args) {
        Service service = new Service();
       // System.out.println(service.getTeacherById(1));
        Teacher teacher = new Teacher();
        teacher.setTeacherName("teacher from jpa 2 oop");
        teacher.setTeacherId(776);
        teacher.setTeacherEmalAddress("jpa@gmail.com");
       // System.out.println(service.createTeacher(teacher));
        System.out.println("hello world");
        //System.out.println(service.updateTeacher(teacher));
        service.removeTeacher(776);

    }
}
