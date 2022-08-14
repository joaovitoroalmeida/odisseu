package odisseu.webservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(value = ["odisseu.*"])
class OdisseuApplication

fun main(args: Array<String>) {
    runApplication<OdisseuApplication>(*args)
}