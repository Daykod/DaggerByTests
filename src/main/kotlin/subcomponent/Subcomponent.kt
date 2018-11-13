package subcomponent

import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import java.util.*

@Module(subcomponents = [ChildSubcomponent::class])
class ParentModule {

    private val rand by lazy { Random() }

    val anInt @Provides get() = rand.nextInt()
}

@Component(modules = [ParentModule::class])
interface ParentComponent {

    val anInt: Int

    fun child(): ChildSubcomponent.Builder
}

@Module
class ChildModule {
    @Provides
    fun aBoolean() = true
}

@Subcomponent(modules = [ChildModule::class])
interface ChildSubcomponent {

    val aBoolean: Boolean

    val anInt: Int

    @Subcomponent.Builder
    interface Builder {
        fun build(): ChildSubcomponent
    }
}
