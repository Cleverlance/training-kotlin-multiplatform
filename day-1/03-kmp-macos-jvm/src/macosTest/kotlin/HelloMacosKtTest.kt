import kotlin.test.Test
import kotlin.test.assertEquals

class HelloMacosKtTest {

    @Test
    fun `hello should have proper form`() {
        assertEquals(helloMacos(), "Hello macOS!")
    }
}