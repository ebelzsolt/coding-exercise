package coding.exercise.expense;

import java.util.List;
import java.util.Map;

import coding.exercise.user.UserService;

/**
 * Service to organize expenses to the required structure.
 */
public class ExpenseOrganizerService {

    private final UserService userService;

    public ExpenseOrganizerService(UserService userService) {
        this.userService = userService;
    }

    public Map<Object, Integer> organize(List<Expense> expenses) {
        return Map.of();
    }

}
