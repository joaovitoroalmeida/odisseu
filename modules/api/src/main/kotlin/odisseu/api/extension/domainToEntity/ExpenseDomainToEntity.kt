package odisseu.api.extension.domainToEntity

import java.util.*
import odisseu.api.domain.ExpenseDomain
import odisseu.api.entity.ExpenseEntity

fun ExpenseDomain.toEntity() =
        ExpenseEntity(
                id = UUID.randomUUID().toString(),
                expenseName = this.expenseName,
                expenseValue = this.expenseValue,
                dueDate = this.dueDate,
                frequency = this.frequency.name
        )