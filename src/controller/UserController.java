package controller;

import model.dto.UserDto;
import model.service.UserService;
import model.service.UserServiceImpl;

import java.util.List;

public class UserController {
    private final UserService userService = new UserServiceImpl();
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }
    public void addNewUser(UserDto userDto){
        userService.addNewUser(userDto);
    }
    public void deleteUser(Integer id){
        userService.deleteUser(id);
    }
}
