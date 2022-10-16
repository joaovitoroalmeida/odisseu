package odisseu.api.extension.domainToEntity

import odisseu.api.domain.ExpenseDomain
import odisseu.api.entity.ExpenseEntity
import java.util.UUID

fun ExpenseDomain.toEntity() =
        ExpenseEntity(
                id = UUID.randomUUID().toString(),
                expenseName = this.expenseName,
                expenseValue = this.expenseValue,
                dueDate = this.dueDate,
                frequency = this.frequency.name
        )