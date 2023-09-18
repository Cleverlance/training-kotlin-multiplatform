import kotlin.test.Test
import kotlin.test.assertContains

class HelloJvmKtTest {

    @Test
    fun `hello should have proper form`() {
        assertContains(hello(), "Hello")
    }
}