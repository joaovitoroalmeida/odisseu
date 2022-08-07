package odisseu.usecase.repository

import odisseu.api.domain.Customer

interface CustomerRepository {
    fun getCustomer(customerId: String): Customer
}