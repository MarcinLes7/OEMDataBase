package pl.wszib.oemdatabase.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("result-table")
public class ResultController {
    @GetMapping
    public String resultPage() {
        return "resultPage";
    }




}
