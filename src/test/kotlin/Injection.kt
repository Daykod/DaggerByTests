import fieldinjection.DaggerFieldInjectionComponent
import fieldinjection.Injectee
import org.junit.Test
import kotlin.test.assertNotSame

class InjectionTest {

    @Test
    fun test() {

        val component = DaggerFieldInjectionComponent.create()

        val injectee = Injectee()

        component.inject(injectee)

        val data = component.data()
        val injectedData = injectee.dependency.data

        assertNotSame(data, injectedData, "These bindings are called for each request")
    }
}