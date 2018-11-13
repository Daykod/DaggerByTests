import constructorinjection.DaggerConstructorInjectionComponent
import org.junit.Test
import kotlin.test.assertEquals

class ConstructorInjectionTest {

    @Test
    fun test() {
        val component = DaggerConstructorInjectionComponent.create()
        assertEquals(component.dependency.anInt, 4)
    }

}