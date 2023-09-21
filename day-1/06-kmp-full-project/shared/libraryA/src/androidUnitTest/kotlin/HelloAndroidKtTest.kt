import kotlin.test.Test
import kotlin.test.assertEquals

class HelloAndroidKtTest {

    @Test
    fun `hello should have proper form`() {
        assertEquals(helloAndroid(), "Hello Android!")
    }
}