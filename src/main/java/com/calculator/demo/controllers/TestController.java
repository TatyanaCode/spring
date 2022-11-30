package com.calculator.demo.controllers;

import com.calculator.demo.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * author danilova.tatyana 23.11.2022
 */
@Controller
@RequestMapping("/")
public class TestController {

    @GetMapping("test")
    public String showTest1(Model model) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            persons.add(new Person("Иван", "Иванов", 19));
        }
        model.addAttribute("persons", persons);
        return "pages/contentPage";

    }

    @GetMapping("page")
    public String showTest2() {
        return "pages/contentPage2";
    }
}
