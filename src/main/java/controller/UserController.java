package controller;

import data.UserData;
import pl.sda.projketoop.model.Role;
import pl.sda.projketoop.model.User;

import javax.print.MultiDocPrintService;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Klasa kontrolra implementuje metody obsługujące żądania
public class UserController {
    public void getAllUsers() {
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

    public Optional<User> getUserByEmail(String serachEmail) {
        return UserData.users
                .stream()
                .filter(user -> user.getEmail().equals(serachEmail))
                .findFirst();
    }

    public String getUserByEmailWithValidation(String searchEmail) {
        Optional<User> userOpt = getUserByEmail(searchEmail);
        if (userOpt.isPresent()) {
            return userOpt.get().toString();
        }
        return "Nie znaleziono " + searchEmail;

    }

    public List<User> getAllUsersWithStatus(boolean status) {
        return UserData.users
                .stream()
                .filter(user -> user.isStatus() == status)
                .collect(Collectors.toList());
    }

    public void updateUserStatusById(int userid, boolean status) {
        UserData.users.stream()
                .filter(user -> user.getUserId() == userid)
                .forEach(user -> user.setStatus(status));

    }

    public boolean updateUserRoleById(int userId, Role role) {
        Optional<User> userOpt = UserData.users.stream()
                .filter(user -> user.getUserId() == userId)
                .findFirst();
        if (userOpt.isPresent()) {
            userOpt.get().setRole(role);
            return true;
        }
                return false;

    }

    public List<User> getAllUsersWithRole(Role role) {
        return UserData.users
                .stream()
                .filter(user -> user.getRole() == role)
                .collect(Collectors.toList());

    }

    public int countActiveUsers(){
        return (int) UserData.users.stream().filter(User::isStatus).count();
        //return (int) UserData.users.stream().filter(user -> user.isStatus() == true).count();
    }
    public int countAdmins(){
        return (int) UserData.users.stream().filter(user -> user.getRole() == Role.ROLE_ADMIN).count();
    }

    public List<User>   getAllusersOrderByRegistrationDateDesc(){
        return UserData.users.stream()
                .sorted(Comparator.comparing(User::getRegistrationDate).reversed())
                .collect(Collectors.toList());
    }
    public List<User> getAllAdminsOrderByEmailAsc(){
        return UserData.users.stream()
                .filter(user -> user.getRole() == Role.ROLE_ADMIN)
                .sorted(Comparator.comparing(User::getEmail))
                .collect(Collectors.toList());
    }
    public List<User> getAllActiveAdminsOrderByEmailAsc(){
        return UserData.users.stream()
                .filter(user -> user.getRole() == Role.ROLE_ADMIN && user.isStatus())
                .sorted(Comparator.comparing(User::getEmail))
                .collect(Collectors.toList());
    }

    public List<User>   getFirst3UsersOrderByRegistrationDateAsc(){
        return UserData.users.stream()
                .sorted(Comparator.comparing((User::getRegistrationDate)))
                .limit(3)
                .collect(Collectors.toList());
    }

}