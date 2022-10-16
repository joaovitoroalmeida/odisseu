package odisseu.database.repository.impl.expense

import odisseu.api.entity.ExpenseEntity
import odisseu.dataprovider.repository.ExpenseRepository
import org.springframework.stereotype.Repository

@Repository
class ExpenseRepositoryImpl: ExpenseRepository {
    override fun create(expenseEntity: ExpenseEntity): ExpenseEntity {
        return expenseEntity
    }
}