package cw_5.view;

import cw_5.model.User;
import cw_5.service.UserService;
import cw_5.service.UserServiceImpl;

public class UserView {
    private UserService userService = new UserServiceImpl();
    public void saveUser(String name, Integer age, Float salary){
        userService.save(new User(name, age, salary));
    }
}
