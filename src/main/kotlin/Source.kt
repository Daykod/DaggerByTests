import dagger.*
import java.util.*
import javax.inject.Singleton

@Module(subcomponents = [SourceSubComponent::class])
class SourceModule {

    private val rand: Random = Random()

    @Provides
    fun fffff(): Float = 3f

    @Provides
    fun computeSomeValue(): Int {
        return rand.nextInt()
    }
}

@Component(modules = [SourceModule::class])
interface SourceComponent {

    fun message(): String

    fun fffffffff(): Float

    fun sub(): SourceSubComponent.Builder

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun message(message: String): Builder

        fun build(): SourceComponent
    }
}

@Module
class SourceSubModule {
    @Provides
    fun booooool() = true
}

@Subcomponent(modules = [SourceSubModule::class])
interface SourceSubComponent {

    fun boollll(): Boolean

    fun randNum() : Int

    @Subcomponent.Builder
    interface Builder {
        fun build(): SourceSubComponent
    }
}
