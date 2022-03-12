package helpcar.usecase.repository

import helpcar.api.domain.Customer

interface CustomerRepository {
    fun getCustomer(customerId: String): Customer
}