package org.ycce_a1_sms.student_management_system.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.ycce_a1_sms.student_management_system.Service.StudentService;
import org.ycce_a1_sms.student_management_system.entity.Student;

@org.springframework.stereotype.Controller
public class Controller
{
    private final StudentService studentService;

    @PostMapping("/students")
    public String save(@ModelAttribute("student") Student student)
    {
        studentService.saveStudent(student);
        return "redirect:/students";
    }


    @GetMapping("/students/new")
    public String CreateStudents(Model model){
        //to hold the new student obj.
        Student student = new Student();
        //                               key        value
        model.addAttribute("student",student);

//        this is Html File
        return  "createStudents";
    }

    @Autowired
    public Controller(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping({ "/students"})
    public String students(Model model)
    {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }
}

