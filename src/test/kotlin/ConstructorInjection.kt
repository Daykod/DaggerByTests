import org.junit.Test

class ConstructorInjectionTest {

    @Test
    fun test() {
        val component = DaggerConstructorInjectionComponent.create()
        println(component.dependency.anInt)
    }

}