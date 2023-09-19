import kotlin.test.Test
import kotlin.test.assertEquals

class HelloIosKtTest {

    @Test
    fun `hello should have proper form`() {
        assertEquals(helloIos(), "Hello iOS!")
    }
}