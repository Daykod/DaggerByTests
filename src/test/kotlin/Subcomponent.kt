import org.junit.Test
import subcomponent.DaggerParentComponent
import kotlin.test.assertNotSame

class SubcomponentTests {

    @Test
    fun test() {
        val parentComponent = DaggerParentComponent.create()

        val childComponent = parentComponent.child().build()

        val firstparentint = parentComponent.anInt
        val secondparentint = parentComponent.anInt
        assertNotSame(firstparentint, secondparentint, "Bindings are still separate instances")

        val childInt1 = childComponent.anInt
        val childInt2 = childComponent.anInt
        assertNotSame(childInt1, childInt2, "Still separate")
        assertNotSame(childInt1, firstparentint, "but also separate from parent")
        assert(childComponent.aBoolean)
        //And the subcomponent is a superset of the parent's graph
    }
}