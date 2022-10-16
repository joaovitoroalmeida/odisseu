package odisseu.database.repository.configuration

import javax.sql.DataSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.datasource.DriverManagerDataSource

@Configuration
class JdbcTemplateConfiguration(
        private val databaseProperties: DatabaseProperties
) {

    @Bean
    fun dataSource(): DataSource {
        return DriverManagerDataSource().apply {
            url = databaseProperties.url
            username = databaseProperties.username
            password = databaseProperties.password
            setDriverClassName(databaseProperties.driver)
        }
    }

    @Bean
    fun jdbcTemplate(dataSource: DataSource): JdbcTemplate {
        return JdbcTemplate(dataSource)
    }
}