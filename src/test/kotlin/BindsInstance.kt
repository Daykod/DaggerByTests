import bindsinstance.DaggerBindingComponent
import bindsinstance.Data
import org.junit.Test
import kotlin.test.assertSame

class BindsInstanceTest {

    @Test
    fun test() {
        val data = Data()
        val component = DaggerBindingComponent.builder().bindData(data).build()
        assertSame(data, component.data)
    }
}