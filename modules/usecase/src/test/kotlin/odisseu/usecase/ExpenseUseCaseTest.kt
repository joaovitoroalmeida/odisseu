package odisseu.usecase

import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.SpyK
import io.mockk.junit5.MockKExtension
import io.mockk.verify
import odisseu.api.domain.ExpenseDomain
import odisseu.usecase.service.ExpenseService
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class ExpenseUseCaseTest {

    @MockK
    private lateinit var expenseService: ExpenseService

    @SpyK
    @InjectMockKs
    private lateinit var expenseUseCase: ExpenseUseCase

    @Test
    fun `should return customer when id is informed`() {

//        every { expenseService.create(any() as ExpenseDomain) } returns mockExpense

//        val customer = this.expenseUseCase.create()

//        verify(exactly = 1) { expenseService.create(any() as ExpenseDomain) }
    }
}