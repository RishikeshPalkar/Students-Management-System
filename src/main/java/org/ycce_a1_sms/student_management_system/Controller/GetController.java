package org.ycce_a1_sms.student_management_system.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.ycce_a1_sms.student_management_system.Service.StudentService;
import org.ycce_a1_sms.student_management_system.entity.Student;

@Controller
public class GetController {

    private final StudentService studentService;

    @Autowired
    public GetController(StudentService studentService) {
        this.studentService = studentService;
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

    @GetMapping( "/students")
    public String students(Model model)
    {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/students/update/{id}")
    public String updateStudent(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return  "updateStudent";
    }
}
