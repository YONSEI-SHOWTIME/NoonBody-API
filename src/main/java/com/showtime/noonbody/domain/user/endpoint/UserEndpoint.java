package com.showtime.noonbody.domain.user.endpoint;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/user")
public class UserEndpoint {

    @PostMapping("/login")
    public void userLogin(){

    }

}
