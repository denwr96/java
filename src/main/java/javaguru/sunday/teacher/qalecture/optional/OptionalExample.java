package main.java.javaguru.sunday.teacher.qalecture.optional;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        UserService service = new UserService(new ArrayList<>());

        Optional<User> userOpt = service.findUser(1);

        if (userOpt.isPresent()) {
            User user = userOpt.get();
            printUserInfo(user);
        }

        userOpt.ifPresent(user -> printUserInfo(user));

    }

    private static void printUserInfo(User user) {
        System.out.println(user.toString());
    }

}
