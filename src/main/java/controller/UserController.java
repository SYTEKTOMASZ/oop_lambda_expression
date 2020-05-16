package controller;

import data.UserData;
import pl.sda.projketoop.model.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Klasa kontrolra implementuje metody obsługujące żądania
public class UserController {
    public void getAllUsers(){
//        for (User user : UserData.users) {
//            System.out.println(user);
//        }
        // tworzenie predykatu CTRL + Space
//        UserData.users                                      // List<User>
//                .stream()                                   // Stream<User>
//                .forEach(user -> System.out.println(user)); // operacja kończąca void
        // wersja uproszczona
        UserData.users.forEach(System.out::println);
    }
    public Optional<User> getUserByEmail(String serachEmail){
        return UserData.users
                .stream()
                .filter(user -> user.getEmail().equals(serachEmail))
                .findFirst();
    }

    public String getUserByEmailWithValidation(String searchEmail){
        Optional<User> userOpt = getUserByEmail(searchEmail);
        if(userOpt.isPresent()){
            return userOpt.get().toString();
        }
        return "Nie znaleziono " + searchEmail;

    }

    public List<User> getAllUsersWithStatus(boolean status){
        return UserData.users
                .stream()
                .filter(user -> user.isStatus() == status)
                .collect(Collectors.toList());
    }

    public void updateUserStatusById(int userid, boolean status){
        UserData.users.stream()
                .filter(user -> user.getUserId() == userid)
                .forEach(user -> user.setStatus(status));

    }

}