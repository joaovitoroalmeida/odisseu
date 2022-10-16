package odisseu.api.request

import java.math.BigDecimal
import java.util.Date
import odisseu.api.common.enum.FrequencyType

data class ExpenseRequest(
        val expenseValue: BigDecimal,
        val expenseName: String,
        val dueDate: Date,
        val frequency: FrequencyType
)
