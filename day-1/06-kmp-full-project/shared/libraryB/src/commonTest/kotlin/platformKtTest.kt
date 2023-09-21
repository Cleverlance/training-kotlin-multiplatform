import kotlin.test.Test
import kotlin.test.assertTrue

class PlatformKtTest {

    @Test
    fun `platform should have proper form`() {
        assertTrue(platform.isNotEmpty())
    }
}