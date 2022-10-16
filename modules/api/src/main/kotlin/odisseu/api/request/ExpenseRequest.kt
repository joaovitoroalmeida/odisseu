package odisseu.api.request

import odisseu.api.common.enum.FrequencyType
import java.math.BigDecimal
import java.util.Date

data class ExpenseRequest(
        val expenseValue: BigDecimal,
        val expenseName: String,
        val dueDate: Date,
        val frequency: FrequencyType
)
