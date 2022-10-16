package odisseu.api.domain

import java.math.BigDecimal
import java.util.Date
import odisseu.api.common.enum.FrequencyType

data class ExpenseDomain(
        val expenseId: String? = null,
        val expenseValue: BigDecimal,
        val expenseName: String,
        val dueDate: Date,
        val frequency: FrequencyType
)