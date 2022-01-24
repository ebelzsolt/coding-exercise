package coding.exercise;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Map;

import coding.exercise.user.UserService;
import coding.exercise.expense.Expense;
import coding.exercise.expense.ExpenseOrganizerService;

public class CodingExerciseApplication {

	private static final LocalDate FIRST_OF_JANUARY = LocalDate.of(2021, Month.JANUARY, 1);
	private static final LocalDate SECOND_OF_JANUARY = LocalDate.of(2021, Month.JANUARY, 2);
	private static final Long FIRST_USER_ID = 1L;
	private static final Long SECOND_USER_ID = 2L;

	public static void main(String[] args) {
		ExpenseOrganizerService service = new ExpenseOrganizerService(new UserService());

		/*
		 * The task:
		 *      - implement ExpenseOrganizerService#organize based on the following
		 *          - the result map should contain the user's name and the date as key
		 *          - the result map should contain the sum of the daily expenses per user as value
		 *      - create a class for the map's key to satisfy the criteria above
		 *      - ordering and formatting is not important
		 *
		 * Additional task:
		 *      - if a user is not found, collect all daily expenses under the username "other"
		 */
		Map<Object, Integer> result = service.organize(getExpenses());
		System.out.println(result);
	}

	/*
	 * Example output for this input:
	 * "Steve",  2021-01-01 -> 300
	 * "Steve",  2021-01-02 -> 150
	 * "George", 2021-01-02 -> 250
	 */
	private static List<Expense> getExpenses() {
		return List.of(
				createExpense(FIRST_USER_ID, 100, FIRST_OF_JANUARY),
				createExpense(FIRST_USER_ID, 200, FIRST_OF_JANUARY),
				createExpense(FIRST_USER_ID, 150, SECOND_OF_JANUARY),
				createExpense(SECOND_USER_ID, 250, SECOND_OF_JANUARY)
		);
	}

	private static Expense createExpense(Long userId, Integer amount, LocalDate date) {
		return new Expense(userId, amount, date);
	}

}
