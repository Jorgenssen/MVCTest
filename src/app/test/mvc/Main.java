package app.test.mvc;

public class Main {

    public static void main(String[] args) {
        Student model = initStudent();
        View view = new View();

        StudentController controller = new StudentController(model, view);

        controller.updateView();
    }

    private static Student initStudent() {
        Student student = new Student();
        student.setName("John Doe");
        student.setLesson("Java MVC");

        return student;
    }
}
