package odisseu.api.extension

import odisseu.api.domain.Customer
import odisseu.api.response.CustomerResponse

fun Customer.toCustomerResponse() = CustomerResponse(
    customerId = this.customerId,
    name = this.name,
    cpf = this.cpf,
    email = this.email,
    phone = this.phone
)