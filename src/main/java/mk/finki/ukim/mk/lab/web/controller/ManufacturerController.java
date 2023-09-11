package mk.finki.ukim.mk.lab.web.controller;

import mk.finki.ukim.mk.lab.service.ManufacturerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/manufacturers")
public class ManufacturerController {

    private final ManufacturerService manufacturerService;

    public ManufacturerController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

    @GetMapping("/add-man")
    public String getAddBalloonPage() {
        return "add-manufacturer";
    }

    @PostMapping("/add")
    public String saveBalloon(@RequestParam String name,
                              @RequestParam String country,
                              @RequestParam String address) {
        this.manufacturerService.saveManufacturer(name, country, address);
        return "redirect:/balloons";
    }
}
