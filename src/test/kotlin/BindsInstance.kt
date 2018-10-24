import org.junit.Test

class BindsInstanceTest {

    @Test
    fun test() {
        val component = DaggerBindingComponent.builder().bindAString("Hello! I am bound!").build()
        println(component.aString)
    }
}