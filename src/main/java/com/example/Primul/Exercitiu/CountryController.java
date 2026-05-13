package com.example.Primul.Exercitiu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/moldova")
    public String Country1() {
        return "Capitala este Chisinau.";
    }

    @GetMapping("/france")
    public String Country2() {
        return "Capitala este Paris.";
    }


    @GetMapping("/germany")
    public String Country3() {
        return "Capitala este Berlin.";
    }
}
