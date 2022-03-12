package helpcar.usecase

import helpcar.api.extension.toCustomerResponse
import helpcar.api.response.CustomerResponse
import helpcar.usecase.repository.CustomerRepository
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