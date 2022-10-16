package odisseu.api.response

import java.math.BigDecimal

data class ExpenseResponse(
        val expenseId: String,
        val expenseValue: BigDecimal,
        val expenseName: String
)