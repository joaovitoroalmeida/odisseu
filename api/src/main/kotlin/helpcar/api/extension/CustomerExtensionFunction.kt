package helpcar.api.extension

import helpcar.api.domain.Customer
import helpcar.api.response.CustomerResponse

fun Customer.toCustomerResponse() = CustomerResponse(
    customerId = this.customerId,
    name = this.name,
    cpf = this.cpf,
    email = this.email,
    phone = this.phone
)