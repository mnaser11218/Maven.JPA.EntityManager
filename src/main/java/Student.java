//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;

//import javax.persistence.Entity;
//import javax.persistence.Id;

//import javax.persistence.Entity;
//import javax.persistence.Id;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    public int studentId;
    public int teacherId;
    public String EmalAddress;
    public String name;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", teacherId=" + teacherId +
                ", EmalAddress='" + EmalAddress + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getEmalAddress() {
        return EmalAddress;
    }

    public void setEmalAddress(String emalAddress) {
        EmalAddress = emalAddress;
    }

    public Student(int studentId, int teacherId, String emalAddress) {
        this.studentId = studentId;
        this.teacherId = teacherId;
        EmalAddress = emalAddress;
    }
//    studentId int NOT NULL,
//    teacherId int NOT NULL,  Name varchar(200),
//    EmalAddress varchar(200)
}
