package controller;

import entity.Student;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.BindingResult;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class studentController {
    @InitBinder
    public void initBinder(WebDataBinder data) {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        s.setLenient(false);
        data.registerCustomEditor(Date.class, new CustomDateEditor(s, true));
    }

    @RequestMapping(value = {"/initFormStudent", "/"})
    public String initFormStudent(Model model) {
        Student s = new Student();
        model.addAttribute("s", s);
        return "insertStudent";
    }

    @RequestMapping("/insertStudent")
    public String insertStudent(@Valid @ModelAttribute("s") Student s, BindingResult result, HttpSession session, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("s", s);
            return "insertStudent";
        } else {
            session.setAttribute("s", s);
            return "viewStudent";
        }
    }

    @RequestMapping("/nextView")
    public String nextView(HttpSession session) {
        return "nextView";
    }
}
