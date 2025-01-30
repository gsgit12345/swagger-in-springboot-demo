package com.example.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@OpenAPIDefinition(
        info = @Info(title = "User API", version = "1.0", description = "API for managing users")
)
public class SwaggerControllerDemo {

    @Operation(summary = "Get user by ID", description = "Fetches user details by ID")
    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") Long iddd) {
        return "User with ID: " + iddd;
    }

    @Operation(summary = "Create a user", description = "Creates a new user")
    @PostMapping
    public String createUser(@RequestBody String user) {
        return "User created: " + user;
    }
//  --:  http://localhost:8080/swagger-ui.html
}
