package View;
import java.util.List;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

public class ViewClassEng implements iGetView {
    public void getView() {
        // Код для отображения представления на английском языке
        System.out.println("View in English");
    }

    @Override
    public void printAllStudents(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printAllStudents'");
    }

    @Override
    public String prompt(String msg) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'prompt'");
    }

}
