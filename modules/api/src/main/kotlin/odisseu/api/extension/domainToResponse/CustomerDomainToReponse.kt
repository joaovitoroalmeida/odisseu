package odisseu.api.extension.domainToResponse

import odisseu.api.domain.CustomerDomain
import odisseu.api.response.CustomerResponse

fun CustomerDomain.toResponse() =
        CustomerResponse(
                id = this.id!!,
                customerName = this.customerName,
                cpf = this.cpf,
                phone = this.phone,
                createdAt = this.createdAt!!,
                updatedAt = this.updatedAt,
                isDeleted = this.isDeleted!!
        )