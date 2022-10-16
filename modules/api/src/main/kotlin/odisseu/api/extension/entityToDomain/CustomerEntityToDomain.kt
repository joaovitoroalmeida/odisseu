package odisseu.api.extension.entityToDomain

import odisseu.api.domain.CustomerDomain
import odisseu.api.entity.CustomerEntity

fun CustomerEntity.toDomain() =
        CustomerDomain(
            id = this.id,
            customerName = this.customerName,
            cpf = this.cpf,
            phone = this.phone,
            createdAt = this.createdAt,
            updatedAt = this.updatedAt,
            isDeleted = this.isDeleted
        )