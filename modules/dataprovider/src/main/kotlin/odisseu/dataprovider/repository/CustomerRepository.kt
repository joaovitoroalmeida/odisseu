package odisseu.dataprovider.repository

import odisseu.api.entity.CustomerEntity

interface CustomerRepository {

    fun create(customerEntity: CustomerEntity): CustomerEntity
}