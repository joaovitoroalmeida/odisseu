package odisseu.dataprovider.repository

import odisseu.api.entity.ExpenseEntity

interface ExpenseRepository {
    fun create(expenseEntity: ExpenseEntity): ExpenseEntity
}