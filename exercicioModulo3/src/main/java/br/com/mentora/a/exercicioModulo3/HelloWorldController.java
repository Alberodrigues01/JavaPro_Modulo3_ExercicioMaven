package br.com.mentora.a.exercicioModulo3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/modulo3")

public class HelloWorldController {


    private final String message = "Hello World !";

    @GetMapping
    public String exercicioModulo3 (){
        return message;
    }
}
