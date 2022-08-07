package odisseu.webservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(value = ["helpcar.webservice", "helpcar.usecase", "helpcar.dataprovider", "helpcar.api"])
class HelpCarApplication

fun main(args: Array<String>) {
    runApplication<HelpCarApplication>(*args)
}