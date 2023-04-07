package com.sosiego.vidrieriademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class VidrieriademoApplication {

    @GetMapping("/mensaje")

    public String mensaje(){

        return "hola bienvenidos a el despliegue nuevo ";
    }
    public static void main(String[] args) {
        SpringApplication.run(VidrieriademoApplication.class, args);
    }

}
