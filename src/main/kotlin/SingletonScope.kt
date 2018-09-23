import dagger.Component
import dagger.Module
import dagger.Provides
import java.util.*
import javax.inject.Singleton

@Module
class SingletonModule {
    private val rand by lazy { Random() }

    @Provides
    fun aRandFloat() = rand.nextFloat()

    @Provides
    @Singleton
    fun aRandSingletonInt() = rand.nextInt()
}

@Singleton
@Component(modules = [SingletonModule::class])
interface SingletonComponent {
    val aRandSingletonInt: Int
    val aRandFloat: Float
}