package odisseu.webservice.controller.customer.v1

import odisseu.api.extension.domainToResponse.toResponse
import odisseu.api.extension.requestToDomain.toDomain
import odisseu.api.request.CustomerRequest
import odisseu.api.response.CustomerResponse
import odisseu.usecase.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/customer")
class CustomerController(
        private val customerService: CustomerService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody customerRequest: CustomerRequest): CustomerResponse {
        val customerDomain = this.customerService.create(customerRequest.toDomain())
        return customerDomain.toResponse()
    }
}