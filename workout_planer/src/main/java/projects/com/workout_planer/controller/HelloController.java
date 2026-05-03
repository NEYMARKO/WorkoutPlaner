package projects.com.workout_planer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.*;
import projects.com.workout_planer.entity.User;
import projects.com.workout_planer.dto.UserResponseDTO;
import projects.com.workout_planer.service.UserService;

@RestController
public class HelloController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("createUser")
    public UserResponseDTO insert(@RequestBody User user)
    {
        UserResponseDTO result = userService.insertUser(user);
        System.out.println(result);
        return result;
    }
}