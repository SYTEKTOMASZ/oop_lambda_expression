package pl.sda.projketoop;

import pl.sda.projketoop.model.Role;
import pl.sda.projketoop.model.User;

public class Main {

    public static void main(String[] args) {
        User u1 = new User();
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
    }
}
