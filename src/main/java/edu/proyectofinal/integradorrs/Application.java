package edu.proyectofinal.integradorrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {


     public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/echo")
    public String echo(@RequestParam String comm){
        System.out.println(System.getenv(comm));
        return "ping";
    }
}