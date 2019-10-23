package ie.eoinahern.bignerdranh.viewmodelconstructing.activity

import ie.eoinahern.bignerdranh.viewmodelconstructing.manual_di.MyFeatureComponent

class MainActivityComponentImpl(private val featureComponent: MyFeatureComponent) :
    MainActivityComponent,
    MyFeatureComponent by featureComponent {

    override val viewModel = MainActivityViewModel(cityRepo)
}