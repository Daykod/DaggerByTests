import org.junit.Test

class ProvidesAndBindsTest {

    @Test
    fun test() {

        val providesComponent = DaggerProvidesComponent.create()
        println(providesComponent.dependency.aString)

        val bindsComponent = DaggerBindsComponent.create()
        println(bindsComponent.dependency.aString)

        val providesAndBindsComponent = DaggerBindsAndProvidesComponent.create()
        val message = providesAndBindsComponent.dependency.aString
        val anInt = providesAndBindsComponent.anInt
        println("$message $anInt")
    }
}