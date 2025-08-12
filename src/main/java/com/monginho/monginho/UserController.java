package com.monginho.monginho;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User requestUser) {
        var newUser = this.userRepository.save(requestUser);
        return ResponseEntity.ok().body(newUser);
    }

    @GetMapping()
    public Iterable<User> getMethodName() {
        return this.userRepository.findAll();
    }

    @GetMapping("/{userId}")
    public User getMethodName(@PathVariable String userId) {
        return this.userRepository.findById(userId).get();
    }
    

}
