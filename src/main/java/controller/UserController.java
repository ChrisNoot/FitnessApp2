package controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/user")
public class UserController {

    @GetMapping("/new")
    public String showUserForm(Model model) {
        return "newUserForm";
    }

    @PostMapping("")
    public void createUser() {

    }
}
