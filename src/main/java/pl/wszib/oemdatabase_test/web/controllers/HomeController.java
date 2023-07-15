package pl.wszib.oemdatabase_test.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") //ścieżka pod którą znajduje się strona główna
    public String homePage(Model model) {
        model.addAttribute("firstName", "Adam");
        return "homePage";
    }

}
