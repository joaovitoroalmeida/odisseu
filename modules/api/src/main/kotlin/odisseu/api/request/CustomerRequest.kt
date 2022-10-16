package odisseu.api.request

import java.time.Instant

data class CustomerRequest(
        val id: String?,
        val customerName: String,
        val cpf: String,
        val phone: String,
        val createdAt: Instant?,
        val updatedAt: Instant?,
        val isDeleted: Boolean?
)
