package ie.eoinahern.bignerdranh.viewmodelconstructing.data

import android.app.Application

class CityRepoImpl constructor(app: Application) : CityRepo {

    override fun printSomething() {
        println("hello city repo")
    }

}