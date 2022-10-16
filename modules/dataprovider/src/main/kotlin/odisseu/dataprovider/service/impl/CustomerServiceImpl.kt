package odisseu.dataprovider.service.impl

import odisseu.api.domain.CustomerDomain
import odisseu.api.extension.domainToEntity.toEntity
import odisseu.api.extension.entityToDomain.toDomain
import odisseu.dataprovider.repository.CustomerRepository
import odisseu.usecase.service.CustomerService
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl(
        private val customerRepository: CustomerRepository
): CustomerService {

    override fun create(customerDomain: CustomerDomain): CustomerDomain {
        val customerEntity = this.customerRepository.create(customerDomain.toEntity())
        return customerEntity.toDomain()
    }
}