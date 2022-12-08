package re.gb.oseminar7.service;

import re.gb.oseminar7.data.Student;

import java.util.List;

public class Service {
    private final List<Student> students;

    public Service(List<Student> students) {
        this.students = students;
    }

    public void service() {
        for (Student student: students) {
            student.getAllMethods();
            System.out.println();
        }
    }
}
