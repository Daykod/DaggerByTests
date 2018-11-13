package constructorinjection

import dagger.Component
import javax.inject.Inject

@Component
interface ConstructorInjectionComponent {
    val dependency: ConstructorInjectedDependency
}

class ConstructorInjectedDependency @Inject constructor() {
    val anInt: Int = 4
}
