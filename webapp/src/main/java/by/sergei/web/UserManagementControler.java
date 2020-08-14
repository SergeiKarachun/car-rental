package by.sergei.web;

import by.sergei.service.UserService;
import by.sergei.repository.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/users")
public class UserManagementControler {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/{id}")
    public User getById(@PathVariable Integer id) {

        return userService.getById(id);
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

}
