package customer.api.request

import com.fasterxml.jackson.annotation.JsonIgnore
import java.util.UUID

data class CustomerRequest(
    @JsonIgnore
    val customerId: String = UUID.randomUUID().toString(),
    val cpf: String,
    val name: String,
    val email: String,
    val phone: String
)