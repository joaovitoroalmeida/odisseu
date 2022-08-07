package helpcar.mockutils

import odisseu.api.domain.Customer

fun buildCustomer(
    customerId: String = "123",
    phone: String = "11987963254",
    email: String = "joao.oliveira@gmail.com",
    cpf: String = "37975804010",
    name: String = "Irineu Batista"
) = Customer(
    customerId = customerId,
    phone = phone,
    email = email,
    cpf = cpf,
    name = name
)