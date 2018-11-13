package simple

import dagger.Component
import dagger.Module
import dagger.Provides


class Data

@Module
class SimpleModule {
    @Provides
    fun data() = Data()
}

@Component(modules = [SimpleModule::class])
interface SimpleComponent {
    val data: Data
}