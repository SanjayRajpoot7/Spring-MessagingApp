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

    // GET request to greet with a custom message by accepting a query parameter 'name'
    @GetMapping("/query")
    public String greetUser(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
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