package odisseu.api.entity

import java.math.BigDecimal
import java.util.*

data class ExpenseEntity(
        val id: String,
        val expenseName: String,
        val expenseValue: BigDecimal,
        val dueDate: Date,
        val frequency: String
)
