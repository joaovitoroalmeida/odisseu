package odisseu.api.response

import java.time.Instant

data class CustomerResponse(
        val id: String,
        val customerName: String,
        val cpf: String,
        val phone: String,
        val createdAt: Instant,
        val updatedAt: Instant?,
        val isDeleted: Boolean
)
