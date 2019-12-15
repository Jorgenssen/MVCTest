package app.test.mvc;

public class View {

    public void printStudentInfo(String studentName, String lesson) {
        System.out.println("Student:" +
                            "\n  Name: " + studentName +
                            "\n  Lesson: " + lesson);
    }
}
