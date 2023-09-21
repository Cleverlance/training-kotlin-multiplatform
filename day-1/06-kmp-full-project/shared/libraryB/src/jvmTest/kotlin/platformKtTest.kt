import kotlin.test.Test
import kotlin.test.assertEquals

class PlatformJvmKtTest {

    @Test
    fun `platform should have proper form`() {
        assertEquals(platform, "JVM")
    }
}