package core.legion.qicket.main_screen

import dagger.Binds
import dagger.Module

@Module
abstract class MainModule {

    @Binds
    abstract fun view(mainActivity: MainActivity): MainFacade.View

    @Binds
    abstract fun presenter(mainPresenter: MainPresenter): MainFacade.Presenter
}