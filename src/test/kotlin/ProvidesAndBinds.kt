import org.junit.Test
import providesbinds.DaggerBindsAndProvidesComponent
import providesbinds.DaggerBindsComponent
import providesbinds.DaggerProvidesComponent

class ProvidesAndBindsTest {

    @Test
    fun test() {

        val providesComponent = DaggerProvidesComponent.create()
        // this component has a module inside for providing bindings

        val bindsComponent = DaggerBindsComponent.create()
        // this component directly creates the implementation for the binding

        val providesAndBindsComponent = DaggerBindsAndProvidesComponent.create()
        // this component does both, but still optimally creates the implementation directly
    }
}