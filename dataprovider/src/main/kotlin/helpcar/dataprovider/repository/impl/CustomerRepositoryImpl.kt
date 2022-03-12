package helpcar.dataprovider.repository.impl

import helpcar.api.domain.Customer
import helpcar.usecase.repository.CustomerRepository
import org.springframework.stereotype.Repository

@Repository
class CustomerRepositoryImpl(): CustomerRepository {

    override fun getCustomer(customerId: String): Customer {
        return Customer(
            customerId = "123",
            phone = "1199502497",
            email = "joao.oliveira@gmail.com",
            cpf = "37975804010",
            name = "João Vitor Oliveira de Almeida"
        )
    }
}