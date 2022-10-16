package odisseu.api.extension.entityToDomain

import odisseu.api.common.enum.FrequencyType
import odisseu.api.domain.ExpenseDomain
import odisseu.api.entity.ExpenseEntity

fun ExpenseEntity.toDomain() =
        ExpenseDomain(
                expenseId = this.id,
                expenseName = this.expenseName,
                expenseValue = this.expenseValue,
                frequency = FrequencyType.valueOf(this.frequency),
                dueDate = this.dueDate
        )