package view;

import controller.UserController;
import model.dto.UserDto;

public class View {
    private static final UserController userController
             = new UserController();
    public static void UI(){
        System.out.println("This is view: ");
        userController.getAllUsers()
                .forEach(System.out::println);

        // addNewUser and deleteUser
        UserDto newUser = new UserDto("Makara", "makara@gmail.com");
        userController.addNewUser(newUser);
        System.out.println("after addNewUser ✅");
        userController.getAllUsers()
                .forEach(System.out::println);


        userController.deleteUser(1);
        System.out.println("after deleteUser ✅");
        userController.getAllUsers()
                .forEach(System.out::println);
    }
}
