package odisseu.api.domain

import odisseu.api.common.enum.FrequencyType
import java.math.BigDecimal
import java.util.Date

data class ExpenseDomain(
        val expenseId: String? = null,
        val expenseValue: BigDecimal,
        val expenseName: String,
        val dueDate: Date,
        val frequency: FrequencyType
)