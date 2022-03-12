package helpcar.customer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(value = ["helpcar"])
class HelpCarApplication

fun main(args: Array<String>) {
    runApplication<HelpCarApplication>(*args)
}