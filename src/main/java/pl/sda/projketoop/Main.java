package pl.sda.projketoop;

import controller.UserController;
import org.w3c.dom.ls.LSOutput;
import pl.sda.projketoop.model.Role;
import pl.sda.projketoop.model.User;

public class Main {

    public static void main(String[] args) {
        /*User u1 = new User();
        User u2 = new User("Tomasz",
                "Sytek",
                "ts@ts.pl",
                "ts");
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        u2.setRole(Role.ROLE_ADMIN);
        System.out.println("nowa rola: " + u2.getRole());
        System.out.println(u2.toString());
        User u3 = new User("Adam","Testowy", "ad@ad.pl","at");
        System.out.println(u3.toString());
        */
        UserController uc = new UserController();
        uc.getAllUsers();
        System.out.println(uc.getUserByEmailWithValidation("A1@aj.pl"));
        System.out.println(uc.getUserByEmailWithValidation("A15@aj.pl"));
        uc.updateUserStatusById(3, false);
        uc.updateUserStatusById(4,false);
        System.out.println("Aktywni");
        uc.getAllUsersWithStatus(true).forEach(System.out::println);
        System.out.println("Nieaktywni");
        uc.getAllUsersWithStatus(false).forEach(System.out::println);


    }
}
