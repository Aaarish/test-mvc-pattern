package mvc;

public class StudentController {
    private StudentModel model;
    private StudentView view;


    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }


    public Integer getStudentRollNo(){
        return model.getRollNo();
    }
    public void setStudentRollNo(Integer rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentName(){
        return model.getStudentName();
    }
    public void setStudentName(String name){
        model.setStudentName(name);
    }

    public String getStudentCity(){
        return model.getCity();
    }
    public void setStudentCity(String city){
        model.setCity(city);
    }

    public void updateView(){
        view.printStudentDetails(model.getStudentName(), model.getRollNo(), model.getCity());
    }
}
