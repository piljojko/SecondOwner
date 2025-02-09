package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> userList;

    public UserRepository(){

        userList = new ArrayList<>(List.of(
                new User(1L, "Ema", "Piljojcic", "emapiljojko@gmail.com", "piljojko", "babaroga123" ),
                new User(2L, "Bozidar", "Arsic", "arsicb@gmail.com", "bokica", "nutella321" )

        ));
    }

    public User create(User user) {
        Long id = Long.valueOf(userList.size() + 1);
        User newUser = new User(id, user.getName(), user.getLastName(), user.getEmail(), user.getUsername(), user.getPassword());
        userList.add(newUser);
        return newUser;
    }

    public List<User> getAll(){
        return userList;

    }


}
