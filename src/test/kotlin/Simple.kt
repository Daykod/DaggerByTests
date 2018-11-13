import org.junit.Test
import simple.DaggerSimpleComponent
import kotlin.test.assertNotSame

class SimpleTest {

    @Test
    fun test() {
        val component = DaggerSimpleComponent.create()
        val data1 = component.data
        val data2 = component.data
        assertNotSame(data1, data2, "Each instance of a binding is not the same object")
    }
}