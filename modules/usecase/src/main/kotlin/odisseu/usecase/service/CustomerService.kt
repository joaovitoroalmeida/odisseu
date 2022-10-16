package odisseu.usecase.service

import odisseu.api.domain.CustomerDomain

interface CustomerService {
    fun create(customerDomain: CustomerDomain): CustomerDomain
}