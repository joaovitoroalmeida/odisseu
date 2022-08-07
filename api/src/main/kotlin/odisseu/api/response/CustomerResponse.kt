package odisseu.api.response

data class CustomerResponse(
    val customerId: String,
    val cpf: String,
    val name: String,
    val email: String,
    val phone: String
)