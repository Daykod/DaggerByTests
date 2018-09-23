import dagger.Component
import dagger.Module
import dagger.Provides

@Module
class SimpleModule {
    @Provides
    fun aFloat() = 3.14f
}

@Component(modules = [SimpleModule::class])
interface SimpleComponent {
    val aFloat: Float
}