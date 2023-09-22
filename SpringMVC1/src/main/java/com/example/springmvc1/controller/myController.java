package com.example.springmvc1.controller;

import com.example.springmvc1.entity.Student;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class myController {
    @InitBinder
    public void initBinder(WebDataBinder binder){
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        s.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(s, true));
    }
    @RequestMapping( "/initStudent")
    public String initForm(Model model){
        Student s = new Student();
        model.addAttribute("stu",s);
        return "studentForm";
    }

    @RequestMapping("/insertStudent")
    public String insertStudent(@ModelAttribute("stu")Student s, Model model){
        model.addAttribute("stu");
        return "viewStudent";
    }
}
