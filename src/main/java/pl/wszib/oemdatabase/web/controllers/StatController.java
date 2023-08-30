package pl.wszib.oemdatabase.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wszib.oemdatabase.services.MeasurementService;
import pl.wszib.oemdatabase.web.models.MeasurementModel;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class StatController {

    @Autowired
    MeasurementService measurementService;

    @GetMapping("/stat-table")
    String statPage(Model model) {
        List<MeasurementModel> measurementsPerformed = measurementService.findAll();
        Map<String, Long> dataMap = measurementsPerformed.
                stream().
                collect(Collectors.groupingBy(MeasurementModel::getFactorName, Collectors.counting()));

        model.addAttribute("labels", dataMap.keySet());
        model.addAttribute("data", dataMap.values());

        return "statPage";
    }

}
