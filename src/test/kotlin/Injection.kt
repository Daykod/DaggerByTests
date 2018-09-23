import org.junit.Test

class InjectionTest {

    @Test
    fun test() {

        val component = DaggerFieldInjectionComponent.create()

        val injectee = Injectee()

        component.inject(injectee)

        println(injectee.dependency.anInt)
    }
}