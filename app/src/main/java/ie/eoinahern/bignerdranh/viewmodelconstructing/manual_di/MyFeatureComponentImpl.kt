package ie.eoinahern.bignerdranh.viewmodelconstructing.manual_di

import ie.eoinahern.bignerdranh.viewmodelconstructing.data.CityRepoImpl

class MyFeatureComponentImpl(
    private val coreCompoenent: CoreComponent
) : MyFeatureComponent, CoreComponent by coreCompoenent {

    override val cityRepo by lazy {
        CityRepoImpl(app)
    }
}