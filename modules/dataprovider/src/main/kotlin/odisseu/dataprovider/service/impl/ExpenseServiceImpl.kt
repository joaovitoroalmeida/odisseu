package odisseu.dataprovider.service.impl

import odisseu.api.domain.ExpenseDomain
import odisseu.api.entity.ExpenseEntity
import odisseu.api.extension.domainToEntity.toEntity
import odisseu.api.extension.entityToDomain.toDomain
import odisseu.dataprovider.repository.ExpenseRepository
import odisseu.usecase.service.ExpenseService
import org.springframework.stereotype.Service

@Service
class ExpenseServiceImpl(
        private val expenseRepository: ExpenseRepository
): ExpenseService {

    override fun create(expenseDomain: ExpenseDomain): ExpenseDomain {
        val entity: ExpenseEntity = expenseRepository.create(expenseDomain.toEntity())
        return entity.toDomain()
    }
}