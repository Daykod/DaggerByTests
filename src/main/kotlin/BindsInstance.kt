import dagger.BindsInstance
import dagger.Component

@Component
interface BindingComponent {

    val aString: String

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun bindAString(aString: String): Builder

        fun build(): BindingComponent
    }

}