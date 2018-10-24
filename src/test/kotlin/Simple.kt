import org.junit.Test

class SimpleTest {

    @Test
    fun test() {

        val component = DaggerSimpleComponent.create()

        println(component.aFloat)
    }
}