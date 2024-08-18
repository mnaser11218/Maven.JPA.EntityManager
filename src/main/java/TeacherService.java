import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;
public class TeacherService {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    public Teacher getTeacherById(int id){
        return entityManager.find(Teacher.class, id);
    }
    public Teacher createTeacher(Teacher teacher){
        entityManager.getTransaction().begin();
         entityManager.persist(teacher);
         entityManager.getTransaction().commit();
         entityManager.close();
         return teacher;
    }

    public Teacher updateTeacher(Teacher teacher){

        entityManager.getTransaction().begin();
      Teacher t =  entityManager.find(Teacher.class, teacher.getTeacherId());
     // t.setTeacherId(teacher.getTeacherId());
      t.setTeacherName(teacher.getTeacherName());
      t.setTeacherEmalAddress(teacher.getTeacherEmalAddress());

      entityManager.getTransaction().commit();
      entityManager.close();
      return t;
    }

    public void removeTeacher(int id){
        entityManager.getTransaction().begin();
        Teacher teacher = entityManager.find(Teacher.class, id);
        entityManager.remove(teacher);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public List<Teacher> findAll(int id){
        entityManager.getTransaction().begin();
        //Iterable<Teacher> teacher = entityManager.findAll();
       // entityManager.remove(teacher);
        //entityManager.getTransaction().commit();
        entityManager.close();
        return null;
    }
}
