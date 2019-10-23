package ie.eoinahern.bignerdranh.viewmodelconstructing.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders


inline fun <reified VM : ViewModel> AppCompatActivity.viewModel(crossinline provider: () -> VM): Lazy<VM> {

    return lazy {
        val factory = object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                val v = provider.invoke()
                return v as T
            }
        }

        ViewModelProviders.of(this, factory).get(VM::class.java)
    }
}