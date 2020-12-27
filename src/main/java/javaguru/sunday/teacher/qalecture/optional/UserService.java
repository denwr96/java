package javaguru.sunday.teacher.qalecture.optional;

import java.util.List;
import java.util.Optional;

public class UserService {

//    private List<User> usersStorage = List.of(
//            new User("Alex", 25),
//            new User("Max", 30),
//            new User("System", 0)
//    );

    private List<User> usersStorage;

    public UserService(List<User> usersStorage) {
        this.usersStorage = usersStorage;
    }

    public Optional<User> findUser(int id) {
        User resultUser = null;
        for (User user : usersStorage) {
            if (user.getId() == id) {
                resultUser = user;
            }
        }
        return Optional.ofNullable(resultUser);
    }
}
