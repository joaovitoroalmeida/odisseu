package odisseu.api.entity

import java.time.Instant
import java.util.UUID

data class CustomerEntity(
        val id: String? = UUID.randomUUID().toString(),
        val customerName: String,
        val cpf: String,
        val phone: String,
        val createdAt: Instant? = Instant.now(),
        val updatedAt: Instant?,
        val isDeleted: Boolean? = false
)
