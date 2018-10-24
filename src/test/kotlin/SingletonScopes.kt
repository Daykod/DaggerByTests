import org.junit.Test

class ScopesTest {

    @Test
    fun test() {
        val component = DaggerSingletonComponent.create()

        val oneInt = component.aRandSingletonInt
        val twoInt = component.aRandSingletonInt

        val oneFloat = component.aRandFloat
        val twoFloat = component.aRandFloat

        println("First int: $oneInt, Second int: $twoInt")
        println("First float: $oneFloat, Second float: $twoFloat")
    }
}