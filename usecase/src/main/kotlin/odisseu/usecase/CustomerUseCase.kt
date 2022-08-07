package odisseu.usecase

import odisseu.api.extension.toCustomerResponse
import odisseu.api.response.CustomerResponse
import odisseu.usecase.repository.CustomerRepository
import org.springframework.stereotype.Component

@Component
class CustomerUseCase(
    private val customerRepository: CustomerRepository
) {

    fun getCustomer(customerId: String): CustomerResponse {
        return this.customerRepository.getCustomer(customerId)
            .toCustomerResponse()
    }
}