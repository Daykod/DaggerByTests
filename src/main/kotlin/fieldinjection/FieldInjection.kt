package fieldinjection

import dagger.Component
import dagger.Module
import dagger.Provides
import simple.SimpleModule
import javax.inject.Inject

class Data @Inject constructor()

class Dependency @Inject constructor(val data: Data)

@Module
class FieldInjectionModule {
    @Provides
    fun data() = Data()
}

@Component(modules = [SimpleModule::class])
interface FieldInjectionComponent {
    fun inject(injectee: Injectee)
    fun data(): Data
}

class Injectee {
    @Inject
    lateinit var dependency: Dependency
}