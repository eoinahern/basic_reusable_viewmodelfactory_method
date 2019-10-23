package ie.eoinahern.bignerdranh.viewmodelconstructing.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ie.eoinahern.bignerdranh.viewmodelconstructing.MyApp
import ie.eoinahern.bignerdranh.viewmodelconstructing.R
import ie.eoinahern.bignerdranh.viewmodelconstructing.utils.viewModel

class MainActivity : AppCompatActivity() {

    private val component by lazy { MainActivityComponentImpl((application as MyApp).featureComp) }
    private val prefs by lazy { component.prefs }
    private val mainViewModel by viewModel { component.viewModel }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item = prefs.getBoolean("boo", true)
        println(item)
        mainViewModel.printStuff()
    }
}
