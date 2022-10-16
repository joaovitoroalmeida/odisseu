package odisseu.api.domain

import java.time.Instant

data class CustomerDomain(
        val id: String?,
        val customerName: String,
        val cpf: String,
        val phone: String,
        val createdAt: Instant?,
        val updatedAt: Instant?,
        val isDeleted: Boolean?
)
