package com.example.poc.servicemetier;

import com.example.poc.domain.User;
import com.example.poc.model.UserDTO;

import java.util.List;

public interface UserMetierService {


    User saveUser(User user);
    User getUserById(Long id);
    List<User> getAllUserByRole();
    void desactiveUser(Long id);
    void activateUser(Long id) ;
    User putUser(Long id, User user);
}
