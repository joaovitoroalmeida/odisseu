package odisseu.database.repository.impl.customer

import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*
import odisseu.api.entity.CustomerEntity
import odisseu.database.repository.impl.customer.sql.CustomerQuery
import odisseu.dataprovider.repository.CustomerRepository
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class CustomerRepositoryImpl(
        private val jdbcTemplate: JdbcTemplate
): CustomerRepository {

    override fun create(customerEntity: CustomerEntity): CustomerEntity {
        this.jdbcTemplate.update(
            CustomerQuery.INSERT_CUSTOMER,
            UUID.fromString(customerEntity.id),
            customerEntity.customerName,
            customerEntity.cpf,
            customerEntity.phone,
            LocalDateTime.ofInstant(customerEntity.createdAt, ZoneId.systemDefault()),
            customerEntity.isDeleted
        )
        return customerEntity
    }
}