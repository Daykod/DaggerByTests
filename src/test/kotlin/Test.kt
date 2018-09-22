import org.junit.Test


class Tests {

    @Test
    fun test() {

        val component = DaggerSourceComponent.builder()
                .message("Hello")
                .build()

        (0..5).forEach {
            println("${component.message()} ${component.fffffffff()}")
        }

        val subcomponent = component.sub().build()

        (0..5).forEach {
            println(subcomponent.randNum())
        }

    }
}