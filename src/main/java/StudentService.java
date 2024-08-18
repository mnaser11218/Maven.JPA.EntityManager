import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class StudentService {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    public Student getStudentById(int id){
        entityManager.getTransaction().begin();
      Student student=  entityManager.find(Student.class, id);
      //  entityManager.getTransaction().commit();
      //  entityManager.close();
        return student;
    }

    public Student createStudent(Student student){
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        return student;
    }

    public Student updateStudent(Student student){

        entityManager.getTransaction().begin();
        Student t =  entityManager.find(Student.class, student.getStudentId());
        // t.setTeacherId(teacher.getTeacherId());
        t.setName(student.getName());
        t.setEmalAddress(student.getEmalAddress());
        t.setTeacherId(student.getTeacherId());
        entityManager.getTransaction().commit();
        entityManager.close();
        return t;
    }
//
//    public void removeTeacher(int id){
//        entityManager.getTransaction().begin();
//        Teacher teacher = entityManager.find(Teacher.class, id);
//        entityManager.remove(teacher);
//        entityManager.getTransaction().commit();
//        entityManager.close();
//    }
//
//    public List<Teacher> findAll(int id){
//        entityManager.getTransaction().begin();
//        //Iterable<Teacher> teacher = entityManager.findAll();
//        // entityManager.remove(teacher);
//        //entityManager.getTransaction().commit();
//        entityManager.close();
//        return null;
//    }
}
