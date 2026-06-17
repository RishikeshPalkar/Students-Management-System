package org.ycce_a1_sms.student_management_system.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.ycce_a1_sms.student_management_system.Service.StudentService;

@Controller
public class DeleteController {

    StudentService studentService;
    @Autowired
    public DeleteController(StudentService studentService) {
        this.studentService = studentService;
    }

   @GetMapping("/students/delete/{id}")
   public String DeleteStudent(@PathVariable("id") Integer id)
    {
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }

}
