import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject

interface StringDependency {
    val aString: String
}

class StringDependencyImpl @Inject constructor() : StringDependency {
    override val aString: String
        get() = "I'm an implementation of an interface!"

}

@Module
class ProvidesModule {
    val dependency: StringDependency @Provides get() = StringDependencyImpl()
}

@Component(modules = [ProvidesModule::class])
interface ProvidesComponent {
    val dependency: StringDependency
}

@Module
interface BindsModule {
    @Binds
    fun bindDependency(impl: StringDependencyImpl): StringDependency
}

@Component(modules = [BindsModule::class])
interface BindsComponent {
    val dependency: StringDependency
}

@Module(includes = [BindsAndProvidesModule.Bindings::class])
class BindsAndProvidesModule {

    val anInt @Provides get() = 3

    @Module
    interface Bindings {
        @Binds
        fun bindDependency(impl: StringDependencyImpl): StringDependency

    }
}

@Component(modules = [BindsAndProvidesModule::class])
interface BindsAndProvidesComponent {
    val dependency: StringDependency
    val anInt: Int
}

