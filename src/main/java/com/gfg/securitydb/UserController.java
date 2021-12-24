package com.gfg.securitydb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/student")
    public String helloStudent(@RequestParam("name") String name) {
        return "Hello student " + name;
    }

    @GetMapping("/admin")
    public String helloAdmin() {
        return "Hello admin";
    }

    @GetMapping("/")
    public String helloAll() {
        return "Open api";
    }
}
