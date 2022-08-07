package odisseu.usecase

import helpcar.mockutils.buildCustomer
import odisseu.usecase.repository.CustomerRepository
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.SpyK
import io.mockk.junit5.MockKExtension
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class CustomerUseCaseTest {

    @MockK
    private lateinit var customerRepository: CustomerRepository

    @SpyK
    @InjectMockKs
    private lateinit var customerUseCase: CustomerUseCase

    @Test
    fun `should return customer when id is informed`() {

        val customerId = "123"
        val fakeCustomer = buildCustomer(customerId = customerId)

        every { customerRepository.getCustomer(customerId) } returns fakeCustomer

        val customer = this.customerUseCase.getCustomer(customerId)

        assertAll(
            "customer",
            { assertEquals("123", customer.customerId) },
            { assertEquals("37975804010", customer.cpf) },
            { assertEquals("joao.oliveira@gmail.com", customer.email) },
            { assertEquals("Irineu Batista", customer.name) },
            { assertEquals("11987963254", customer.phone) }
        )
        verify(exactly = 1) { customerRepository.getCustomer(customerId) }
    }
}