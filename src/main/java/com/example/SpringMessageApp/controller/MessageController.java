package com.example.SpringMessageApp.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")  // Base URL for the message endpoints
public class MessageController {

    private String message = "Hello from BridgeLabz";  // Example message

    // GET request for /hello
    @GetMapping("/hello")
    public String sayHello() {
        return message;
    }

    // POST request to greet with a custom message (using @RequestBody for POST body)
    @PostMapping("/greet")
    public String greetUser(@RequestBody String name) {
        return "Hello, " + name;
    }

    // PUT request for /update/{id}
    @PutMapping("/update/{id}")
    public String updateMessage(@PathVariable int id, @RequestBody String newMessage) {
        // Simulating a resource update
        return "Message with ID " + id + " updated to: " + newMessage;
    }

    // DELETE request for /delete/{id}
    @DeleteMapping("/delete/{id}")
    public String deleteMessage(@PathVariable int id) {
        // Simulating a resource deletion
        return "Message with ID " + id + " deleted.";
    }
}