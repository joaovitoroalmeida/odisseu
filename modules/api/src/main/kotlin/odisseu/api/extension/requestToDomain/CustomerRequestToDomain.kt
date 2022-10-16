package odisseu.api.extension.requestToDomain

import odisseu.api.domain.CustomerDomain
import odisseu.api.request.CustomerRequest

fun CustomerRequest.toDomain() =
        CustomerDomain(
                id = this.id,
                customerName = this.customerName,
                cpf = this.cpf,
                phone = this.phone,
                createdAt = this.createdAt,
                updatedAt = this.updatedAt,
                isDeleted = this.isDeleted
        )