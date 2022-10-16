package odisseu.database.repository.impl.customer.sql

object CustomerQuery {

    private const val TABLE_NAME = "customer"

    private const val CUSTOMER_VALUES = """
        id,
        customer_name,
        cpf,
        phone,
        created_at,
        updated_at,
        is_deleted
    """

    const val INSERT_CUSTOMER = """
        INSERT INTO $TABLE_NAME (
           id,
           customer_name,
           cpf,
           phone,
           created_at,
           is_deleted
        ) VALUES (
            ?, ?, ?, ?, ?, ?
        )
    """
}