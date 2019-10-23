package ie.eoinahern.bignerdranh.viewmodelconstructing.manual_di

import android.app.Application
import android.content.SharedPreferences

interface CoreComponent {

    val app : Application
    val prefs : SharedPreferences

}