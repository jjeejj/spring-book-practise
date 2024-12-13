package com.example.demo.converter;

import com.example.demo.dto.StudentDTO;
import com.example.demo.model.Student;

public class StudentConverter {
    public static StudentDTO convertStudent(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        return studentDTO;
    }


    public static Student convertStudentDTO(StudentDTO studentDTO) {
        Student student = new Student();
//        student.setId(student.getId());
        student.setAge(studentDTO.getAge());
        return student;
    }
}
