package helpcar.api.domain

data class Customer(
    val customerId: String,
    val cpf: String,
    val name: String,
    val email: String,
    val phone: String
)