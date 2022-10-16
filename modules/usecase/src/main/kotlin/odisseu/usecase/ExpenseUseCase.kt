package odisseu.usecase

import odisseu.api.domain.ExpenseDomain
import odisseu.usecase.service.ExpenseService
import org.springframework.stereotype.Component

@Component
class ExpenseUseCase(
        private val expenseService: ExpenseService
) {

    fun create(expenseDomain: ExpenseDomain): ExpenseDomain {
       return expenseService.create(expenseDomain)
    }
}