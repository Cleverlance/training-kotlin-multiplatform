import kotlin.test.Test
import kotlin.test.assertEquals

class HelloJvmKtTest {

    @Test
    fun `hello should have proper form`() {
        assertEquals(helloJvm(), "Hello JVM!")
    }
}