package ie.eoinahern.bignerdranh.viewmodelconstructing.activity

import android.content.SharedPreferences

interface MainActivityComponent {
    val prefs: SharedPreferences
    val viewModel: MainActivityViewModel
}