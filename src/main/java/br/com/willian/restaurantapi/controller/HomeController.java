package br.com.willian.restaurantapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/", "/home"})
public class HomeController {

    @GetMapping
    public ResponseEntity home(){
        return ResponseEntity.ok("Service online!");
    }
}
