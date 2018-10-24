import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class FieldInjectionModule {
    @Provides
    fun aFloat() = 3.14f
}

@Component(modules = [SimpleModule::class])
interface FieldInjectionComponent {
    fun inject(injectee: Injectee)
}

class Dependency @Inject constructor() {
    val anInt: Int = 1
}

class Injectee {
    @Inject
    lateinit var dependency: Dependency
}