package blank;

import org.kj.Course;
import org.kj.Lecturer;
import org.kj.Student;
import org.kj.Module;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class College {

    public College() {

    }

    public String run() {
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

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream s = new PrintStream(baos);

        for (Course course : courses) {
            s.println("Course: " + course.getName() + "\nModules: ");
            for (Module module : course.getModules()) {
                s.println(module.getName());
            }
            s.println("\n");
        }

        for (Student student : students) {
            s.println(student.getFullName());
            s.println("Username: " + student.getUsername());
            s.println("Course(s): ");
            for (Course course : student.getCourses()) {
                s.println(course.getName());
            }
            s.println("Modules: ");
            for (Module module : student.getModules()) {
                s.println(module.getName());
            }
            s.println("\n");
        }

        s.flush();
        return baos.toString();
    }

}
