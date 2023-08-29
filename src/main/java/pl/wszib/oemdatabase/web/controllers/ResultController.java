package pl.wszib.oemdatabase.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wszib.oemdatabase.services.MeasurementService;

@Controller
@RequestMapping("result-table")
public class ResultController {

    private final MeasurementService measurementService;

    public ResultController(MeasurementService measurementService) {
        this.measurementService = measurementService;
    }

    @GetMapping
    public String resultPage(Model model) {
        final var results = measurementService.findAll();
        model.addAttribute("results", results);
        return "resultPage";
    }
}
