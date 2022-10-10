import org.kj.Course;
import org.kj.Lecturer;
import org.kj.Student;
import org.kj.Module;

import java.util.ArrayList;
import java.util.Arrays;

public class College {

    public College() {

    }

    public void run() {
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(
                new Student("John", "Smith", "2001-01-01", "1"),
                new Student("Jenny", "Smith", "2002-02-01", "2"),
                new Student("James", "Smith", "2002-03-01", "3")
        ));

        ArrayList<Lecturer> lecturers = new ArrayList<>(Arrays.asList(
                new Lecturer("Mark", "Johnson", "1981-01-01", "1"),
                new Lecturer("John", "Marks", "1982-01-01", "2"),
                new Lecturer("Joan", "Johnson", "1983-03-02", "3")
        ));

        ArrayList<Course> courses = new ArrayList<>(Arrays.asList(
                new Course("IT", "2022-09-01", "2022-12-20"),
                new Course("Arts", "2022-09-01", "2022-12-20")
        ));

        ArrayList<Module> modules = new ArrayList<>(Arrays.asList(
                new Module("Programming", "1", lecturers.get(0)),
                new Module("Software Engineering", "2", lecturers.get(0)),
                new Module("Dynamics", "3", lecturers.get(1)),
                new Module("Intro to Arts", "4", lecturers.get(0)),
                new Module("Politics", "5", lecturers.get(2)),
                new Module("Geography", "6", lecturers.get(2))
        ));

        for (int i = 0; i != 2; i++) {
            for (int k = 0; k != 3; k++) {
                courses.get(i).addModule(modules.get((i * 3) + k)); //First 3 modules to first course, last 3 to second course
            }
        }

        courses.get(0).addStudent(students.get(0));
        courses.get(0).addStudent(students.get(1));
        courses.get(0).addStudent(students.get(2));
        courses.get(1).addStudent(students.get(2));

        for (Course course : courses) {
            System.out.println("Course: " + course.getName() + "\nModules: ");
            for (Module module : course.getModules()) {
                System.out.println(module.getName());
            }
            System.out.println("\n");
        }

        for (Student student : students) {
            System.out.println(student.getFullName());
            System.out.println("Username: " + student.getUsername());
            System.out.println("Course(s): ");
            for (Course course : student.getCourses()) {
                System.out.println(course.getName());
            }
            System.out.println("Modules: ");
            for (Module module : student.getModules()) {
                System.out.println(module.getName());
            }
            System.out.println("\n");
        }
    }

}
