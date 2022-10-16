package odisseu.api.extension.domainToResponse

import odisseu.api.domain.ExpenseDomain
import odisseu.api.response.ExpenseResponse

fun ExpenseDomain.toResponse() =
        ExpenseResponse(
                expenseId = this.expenseId!!,
                expenseValue = this.expenseValue,
                expenseName = this.expenseName
        )