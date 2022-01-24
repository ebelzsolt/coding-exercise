package coding.exercise.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Provides user related information.
 */
public class UserService {

    private final Map<Long, User> users;

    public UserService() {
        this.users = Map.of(
                1L, new User(1L, "Steve"),
                2L, new User(2L, "George"),
                3L, new User(3L, "Liam")
        );
    }

    /**
     * Retrieves all users.
     *
     * @return list of {@link User}
     */
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    /**
     * Find a user with a given id.
     *
     * @param id user id
     * @return {@link User} or null
     */
    public User findById(Long id) {
        return users.get(id);
    }

}
