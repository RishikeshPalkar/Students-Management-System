package org.ycce_a1_sms.student_management_system.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.ycce_a1_sms.student_management_system.Service.StudentService;
import org.ycce_a1_sms.student_management_system.entity.Student;

@org.springframework.stereotype.Controller
public class PostController
{
    private final StudentService studentService;

    @Autowired
    public PostController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public String save(@ModelAttribute("student") Student student)
    {
        studentService.saveStudent(student);
        return "redirect:/students";
    }
    @PostMapping("/students/update/{id}")
    public String editStudent(@PathVariable Integer id, @ModelAttribute("student") Student student) {
        student.setId(id);
        studentService.updateStudent(id, student);
        return "redirect:/students";
    }
}
