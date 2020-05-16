package data;

import pl.sda.projketoop.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface UserData {
    //publiczne statyczne finalne
    List<User> users = new ArrayList<>(Arrays.asList(
            new User("Adam", "Jeden","A1@aj.pl","a1"),
            new User("Adam", "Dwa","A2@aj.pl","a2"),
            new User("Adam", "Tri","A3@aj.pl","a3"),
            new User("Adam", "Czytyry","A4@aj.pl","a4"),
            new User("Adam", "Piona","A5@aj.pl","a5"),
            new User("Adam", "Szema","A6@aj.pl","a6"),
            new User("Adam", "Siema","A7@aj.pl","a7"),
            new User("Adam", "Osiem","A8@aj.pl","a8")
    ));
}
