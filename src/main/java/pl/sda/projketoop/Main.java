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


    }
}
