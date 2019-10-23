package ie.eoinahern.bignerdranh.viewmodelconstructing.manual_di

import android.content.SharedPreferences
import ie.eoinahern.bignerdranh.viewmodelconstructing.data.CityRepo

interface MyFeatureComponent {
    val prefs: SharedPreferences
    val cityRepo: CityRepo
}