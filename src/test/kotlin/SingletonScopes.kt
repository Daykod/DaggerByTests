import org.junit.Test
import singletonscope.DaggerSingletonComponent
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class ScopesTest {

    @Test
    fun test() {
        val component = DaggerSingletonComponent.create()

        val oneInt = component.aRandSingletonInt
        val twoInt = component.aRandSingletonInt

        val oneFloat = component.aRandFloat
        val twoFloat = component.aRandFloat

        assertEquals(oneInt, twoInt, "Scoped bindings are reused")
        assertNotEquals(oneFloat, twoFloat, "Non scoped bindings are not reused")
    }
}