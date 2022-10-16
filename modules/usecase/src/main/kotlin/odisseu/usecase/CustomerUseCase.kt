package odisseu.usecase

import odisseu.api.domain.CustomerDomain
import odisseu.usecase.service.CustomerService
import org.springframework.stereotype.Component

@Component
class CustomerUseCase(
        private val customerService: CustomerService
) {

    fun create(customerDomain: CustomerDomain): CustomerDomain {
        return this.customerService.create(customerDomain)
    }
}