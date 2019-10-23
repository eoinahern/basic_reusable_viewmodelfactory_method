package ie.eoinahern.bignerdranh.viewmodelconstructing.activity

import androidx.lifecycle.ViewModel
import ie.eoinahern.bignerdranh.viewmodelconstructing.data.CityRepo

class MainActivityViewModel(private val repo: CityRepo) : ViewModel() {

    fun printStuff() {
        repo.printSomething()
    }
}