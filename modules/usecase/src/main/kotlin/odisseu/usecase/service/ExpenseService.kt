package odisseu.usecase.service

import odisseu.api.domain.ExpenseDomain

interface ExpenseService {
    fun create(expenseDomain: ExpenseDomain): ExpenseDomain
}