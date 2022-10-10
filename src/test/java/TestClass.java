import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {
    @Test
    public void assertCollegeOutput() {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);

        System.setOut(ps);

        College college = new College();
        college.run();

        System.out.flush();
        assertEquals(os.toString(), "Course: IT\n" +
                "Modules: \n" +
                "Programming\n" +
                "Software Engineering\n" +
                "Dynamics\n" +
                "\n" +
                "\n" +
                "Course: Arts\n" +
                "Modules: \n" +
                "Intro to Arts\n" +
                "Politics\n" +
                "Geography\n" +
                "\n" +
                "\n" +
                "John Smith\n" +
                "Username: JohnSmith21\n" +
                "Course(s): \n" +
                "IT\n" +
                "Modules: \n" +
                "Programming\n" +
                "Software Engineering\n" +
                "Dynamics\n" +
                "\n" +
                "\n" +
                "Jenny Smith\n" +
                "Username: JennySmith20\n" +
                "Course(s): \n" +
                "IT\n" +
                "Modules: \n" +
                "Programming\n" +
                "Software Engineering\n" +
                "Dynamics\n" +
                "\n" +
                "\n" +
                "James Smith\n" +
                "Username: JamesSmith20\n" +
                "Course(s): \n" +
                "IT\n" +
                "Arts\n" +
                "Modules: \n" +
                "Programming\n" +
                "Software Engineering\n" +
                "Dynamics\n" +
                "Intro to Arts\n" +
                "Politics\n" +
                "Geography\n" +
                "\n" +
                "\n");
    }
}
