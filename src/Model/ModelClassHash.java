package Model;

import java.util.List;
import java.util.HashMap;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

public class ModelClassHash implements iGetModel {
    private HashMap<Integer, Student> studentMap;

    public ModelClassHash() {
        studentMap = new HashMap<>();
    }


    public void addStudent(int id, Student student) {
        studentMap.put(id, student);
    }

    public void deleteStudent(int id) {
        if (studentMap.containsKey(id)) {
            studentMap.remove(id);
        }
    }

    @Override
    public List<Student> getStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudents'");
    }
}