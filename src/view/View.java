package view;

import controller.UserController;

public class View {
    private static final UserController userController
             = new UserController();
    public static void UI(){
        System.out.println("This is view: ");
        userController.getAllUsers()
                .forEach(System.out::println);
    }
}
