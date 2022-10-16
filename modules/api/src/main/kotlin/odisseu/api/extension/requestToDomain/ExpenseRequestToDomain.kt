package odisseu.api.extension.requestToDomain

import odisseu.api.domain.ExpenseDomain
import odisseu.api.request.ExpenseRequest

fun ExpenseRequest.toDomain() =
        ExpenseDomain(
                expenseValue = this.expenseValue,
                expenseName = this.expenseName,
                frequency = this.frequency,
                dueDate = this.dueDate
        )