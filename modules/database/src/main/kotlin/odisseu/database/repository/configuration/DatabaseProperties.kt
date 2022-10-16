package odisseu.database.repository.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
data class DatabaseProperties(
        @Value("\${spring.datasource.url}") val url: String,
        @Value("\${spring.datasource.username}") val username: String,
        @Value("\${spring.datasource.password}") val password: String,
        @Value("\${spring.datasource.driver-class-name}") val driver: String
)