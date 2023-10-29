import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student stud = new Student("Imel", 1, new int[]{95, 89, 84});
        Student student2 = new Student("chips", 2, new int[]{54, 80, 90});


        Teacher teacher = new Teacher("Mr.Alex lee", "Java");


        College college = new College("CCI", new ArrayList<Student>(), new ArrayList<Teacher>());


        college.getStudents().add(stud);
        college.getStudents().add(student2);
        college.getTeachers().add(teacher);


        System.out.println("College Name: " + college.getName());
        System.out.println("Students:");
        for (Student student : college.getStudents()) {
            System.out.println("Name: " + student.getName() + ", ID: " );
        }
        System.out.println("Teachers:");
        for (Teacher teacherObj : college.getTeachers()) {
            System.out.println("Name: " + teacherObj.getName() + ", Subject: " + teacherObj.getSubject());
        }

    }
}