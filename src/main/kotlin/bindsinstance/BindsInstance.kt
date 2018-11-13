package bindsinstance

import dagger.BindsInstance
import dagger.Component

class Data
@Component
interface BindingComponent {

    val data: Data

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun bindData(data: Data): Builder

        fun build(): BindingComponent
    }

}