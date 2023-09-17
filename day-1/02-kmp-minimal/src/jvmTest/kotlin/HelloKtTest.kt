import kotlin.test.Test
import kotlin.test.assertEquals

class HelloKtTest {

    @Test
    fun `hello should have proper form`() {
        assertEquals(hello(), "Hello!")
    }
}