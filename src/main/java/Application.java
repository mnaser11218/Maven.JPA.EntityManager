public class Application {
    public static void main(String[] args) {
        TeacherService service = new TeacherService();
        StudentService studentService = new StudentService();
       // System.out.println(studentService.getStudentById(4));
       // System.out.println(service.getTeacherById(1));
//        Teacher teacher = new Teacher();
//         Student student = new Student();
//         student.setStudentId(50);
//         student.setEmalAddress("jpa@gmail.com");
//         student.setTeacherId(1);
//         student.setName("ronald");
      //  System.out.println(studentService.createStudent(student));

//        Student student2 = new Student();
//        student2.setStudentId(50);
//        student2.setEmalAddress("jpa2@gmail.com");
//        student2.setTeacherId(2);
//        student2.setName("ronald updated");
//        System.out.println(studentService.updateStudent(student2));
        studentService.removeStudent(43);
//        teacher.setTeacherName("teacher from jpa 2 oop");
//        teacher.setTeacherId(776);
//        teacher.setTeacherEmalAddress("jpa@gmail.com");
//       // System.out.println(service.createTeacher(teacher));
//        System.out.println("hello world");
//        //System.out.println(service.updateTeacher(teacher));
//        service.removeTeacher(776);



    }
}
