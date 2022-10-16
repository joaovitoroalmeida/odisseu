package odisseu.webservice.controller.v1

import odisseu.api.domain.ExpenseDomain
import odisseu.api.extension.domainToResponse.toResponse
import odisseu.api.extension.requestToDomain.toDomain
import odisseu.api.request.ExpenseRequest
import odisseu.api.response.ExpenseResponse
import odisseu.usecase.ExpenseUseCase
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/expense")
class ExpenseController(
        private val expenseUseCase: ExpenseUseCase
) {

    companion object {
        private val logger = LoggerFactory.getLogger(this::class.java)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody expenseRequest: ExpenseRequest): ExpenseResponse {
        logger.info("Creating expense request received. AdditionalInfo {$expenseRequest}")
        val domain: ExpenseDomain = expenseUseCase.create(expenseRequest.toDomain())
        logger.info("Successfully when trying create expense. AdditionalInfo {$domain}")
        return domain.toResponse()
    }
}