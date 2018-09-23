import org.junit.Test

class SubcomponentTests {

    @Test
    fun test() {
        val parentComponent = DaggerParentComponent.create()

        val childComponent = parentComponent.child().build()

        println("Parent 1st int : ${parentComponent.anInt}")
        println("Parent 2nd int : ${parentComponent.anInt}")

        println("Child 1st int: ${childComponent.anInt}")
        println("Child 2nd int: ${childComponent.anInt}")
        println("Child has a boolean too, ${childComponent.aBoolean}")
    }
}