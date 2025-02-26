package com.example.SpringMessageApp.controller;


import com.example.SpringMessageApp.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private String message = "Hello from BridgeLabz";  // Example message

    // GET request for /hello
    @GetMapping("/hello")
    public String sayHello() {
        return message;
    }

//    @GetMapping("/hello")
//    public ResponseEntity<String> sayHello() {
//        return ResponseEntity.ok(message);
//    }

    // GET request to greet with a custom message by accepting a path variable 'name'
    @GetMapping("/param/{name}")
    public String greetUser(@PathVariable String name) {
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

    @PutMapping("/put/{firstName}")
    public String greetUser(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}