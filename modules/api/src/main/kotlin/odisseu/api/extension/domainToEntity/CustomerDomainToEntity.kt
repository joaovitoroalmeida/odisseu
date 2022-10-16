package odisseu.api.extension.domainToEntity

import odisseu.api.domain.CustomerDomain
import odisseu.api.entity.CustomerEntity

fun CustomerDomain.toEntity() =
        CustomerEntity(
            customerName = this.customerName,
            cpf = this.cpf,
            phone = this.phone,
            updatedAt = this.updatedAt
        )