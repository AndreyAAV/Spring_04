package by.itclass.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/index1")
    public String index1(Model model) {
        List<String> list = Arrays.asList("Java", "C++", "JavaScript");
        model.addAttribute("list", list);
        return "index";
    }

    @RequestMapping("/index2")
    public ModelAndView index2() {
        ModelAndView modelAndView = new ModelAndView();
        List<String> list = Arrays.asList("Java", "C++", "JavaScript");
        modelAndView.addObject("list", list);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/index3")
    public String index3(HttpServletRequest request, HttpSession session) {
        List<String> list = Arrays.asList("Java", "C++", "JavaScript");
       request.setAttribute("list", list);
        return "index";
    }
}
