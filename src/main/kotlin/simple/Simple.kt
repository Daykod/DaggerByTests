package simple

import dagger.Component
import dagger.Module
import dagger.Provides
import java.util.*

@Module
class SimpleModule {

    @Provides
    fun aFloat() = 3f

}

@Component(modules = [SimpleModule::class])
interface SimpleComponent
