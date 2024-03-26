package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

//import com.mycustomer.model.Customer;
import com.student.model.Student;
import com.student.service.StudentService;

@Controller
public class StudentController {
	 @Autowired
     private StudentService StudentService;
     
     @GetMapping("/")
     public String viewHomePage(Model model) {
    	 model.addAttribute("listStudent", StudentService.getAllStudent());
    	 return "index";
     }
     @GetMapping("/showNewStudentForm")
     public String showNewCustomerForm(Model model) {
    	 Student student=new Student();
    	 model.addAttribute("student", student);
    	 return "new_student";
     }
     @PostMapping("/saveStudent")
     public String saveStudent(@ModelAttribute("student") Student student) {
    	 StudentService.saveStudent(student);
    	 return "redirect:/";
     }
     @GetMapping("/showFormForUpdate/{id}")
     public String showFormForUpdate(@PathVariable(value="id")long id, Model model) {
     
    	 Student student= StudentService.getStudentById(id);
     
     model.addAttribute("student",student);
     return "update_student";
}
     @GetMapping("/deleteStudent/{id}")
     public String deleteCustomer(@PathVariable(value="id")long id) {
    	 this.StudentService.deleteStudentById(id);
    	 return "redirect:/";
     }

}
