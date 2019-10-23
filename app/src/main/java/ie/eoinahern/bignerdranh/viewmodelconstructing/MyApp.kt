package ie.eoinahern.bignerdranh.viewmodelconstructing

import android.app.Application
import ie.eoinahern.bignerdranh.viewmodelconstructing.manual_di.CoreCompImpl
import ie.eoinahern.bignerdranh.viewmodelconstructing.manual_di.MyFeatureComponent
import ie.eoinahern.bignerdranh.viewmodelconstructing.manual_di.MyFeatureComponentImpl

class MyApp : Application() {

    private val coreComponent by lazy { CoreCompImpl(this) }
    lateinit var featureComp: MyFeatureComponent

    override fun onCreate() {
        super.onCreate()
        featureComp = MyFeatureComponentImpl(coreComponent)
    }
}