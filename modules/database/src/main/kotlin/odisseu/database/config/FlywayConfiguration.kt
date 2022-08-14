package odisseu.database.config

import org.flywaydb.core.Flyway
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.core.env.Environment

@Configuration
class FlywayConfiguration(
        private val environment: Environment
) {

    @Profile("local")
    @Bean(initMethod = "migrate")
    fun flyway(): Flyway {
        return Flyway(
                Flyway.configure()
                        .baselineOnMigrate(environment.getRequiredProperty("spring.flyway.baseline-on-migrate").toBoolean())
                        .baselineVersion(environment.getRequiredProperty("spring.flyway.baseline-version"))
                        .schemas(environment.getRequiredProperty("spring.flyway.schemas"))
                        .dataSource(
                            environment.getRequiredProperty("spring.flyway.url"),
                            environment.getRequiredProperty("spring.flyway.user"),
                            environment.getRequiredProperty("spring.flyway.password")
                        )
        )
    }
}