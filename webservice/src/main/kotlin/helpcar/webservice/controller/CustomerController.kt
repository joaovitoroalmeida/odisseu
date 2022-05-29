package helpcar.webservice.controller

import helpcar.api.request.CustomerRequest
import helpcar.api.response.CustomerResponse
import helpcar.usecase.CustomerUseCase
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.slf4j.LoggerFactory

@RestController
@RequestMapping("customers")
class CustomerController(
    private val customerUseCase: CustomerUseCase
) {

    companion object {
        private val logger = LoggerFactory.getLogger(CustomerController::class.java)
    }

    @GetMapping("{customer_id}")
    fun getCustomer(@PathVariable("customer_id") customerId: String): CustomerResponse {
        logger.info("Init get customer with id: $customerId")
        return this.customerUseCase.getCustomer(customerId)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createCustomer(@RequestBody customer: CustomerRequest): CustomerRequest {
        logger.info("Init create customer: $customer")
        return customer
    }
}