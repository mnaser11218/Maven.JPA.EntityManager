
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="teacher")
@Entity
public class Teacher {
    @Column(name = "teacherId")
    @Id
    public int teacherId;


    @Column(name = "teacherName")
    public String teacherName;
    @Column(name = "teacherEmalAddress")
    public String teacherEmalAddress;

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", teacherEmalAddress='" + teacherEmalAddress + '\'' +
                '}';
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherEmalAddress() {
        return teacherEmalAddress;
    }

    public void setTeacherEmalAddress(String teacherEmalAddress) {
        this.teacherEmalAddress = teacherEmalAddress;
    }

    public Teacher(int teacherId, String teacherName, String teacherEmalAddress) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherEmalAddress = teacherEmalAddress;
    }
}

