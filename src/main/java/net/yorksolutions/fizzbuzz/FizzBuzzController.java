package net.yorksolutions.fizzbuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fizzbuzz")

public class FizzBuzzController {

    public FizzBuzzService service;
    @Autowired

    public FizzBuzzController(FizzBuzzService fizzBuzzService) {
        this.service = fizzBuzzService;
    }

    @GetMapping("/play")
    public void fizzBuzz (@RequestParam int number) {
        service.fizzBuzz(number);
    }


}
