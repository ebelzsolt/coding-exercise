package coding.exercise.expense;

import java.time.LocalDate;

/**
 * Encapsulates information about an expense amount for a given day by a user.
 */
public final class Expense {

    private final Long userId;
    private final Integer amount;
    private final LocalDate data;

    public Expense(Long userId, Integer amount, LocalDate data) {
        this.userId = userId;
        this.amount = amount;
        this.data = data;
    }

    public Long getUserId() {
        return userId;
    }

    public Integer getAmount() {
        return amount;
    }

    public LocalDate getData() {
        return data;
    }
}
