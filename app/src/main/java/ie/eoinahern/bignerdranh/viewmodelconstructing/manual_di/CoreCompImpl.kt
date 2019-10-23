package ie.eoinahern.bignerdranh.viewmodelconstructing.manual_di

import android.app.Application
import androidx.preference.PreferenceManager

class CoreCompImpl(override val app: Application) : CoreComponent {

    override val prefs by lazy {
        PreferenceManager.getDefaultSharedPreferences(app)
    }
}