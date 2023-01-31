import mvc.StudentController;
import mvc.StudentModel;
import mvc.StudentView;

public class Main {
    public static void main(String[] args) {
        StudentModel model = defaultModel();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.setStudentName("Aarish");
        controller.updateView();
    }

    public static StudentModel defaultModel(){
        StudentModel studentModel = new StudentModel();

        studentModel.setStudentName("King");
        studentModel.setRollNo(1);
        studentModel.setCity("Delhi");

        return studentModel;
    }
}