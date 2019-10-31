package dev.haenara.essential

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dev.haenara.core.CoreModule
import kotlinx.android.synthetic.main.activity_multi_module_common.*

abstract class MultiModuleCommonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_module_common)
        common_tv.text = CoreModule.getHelloString()
        common_btn_feature1.setOnClickListener {
            showToast(getFeature1Value())
        }
        common_btn_feature2.setOnClickListener {
            showToast(getFeature2Value())
        }
    }

    private fun showToast(message: String?){
        message?.let{
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
    }

    abstract fun getFeature1Value(): String?
    abstract fun getFeature2Value(): String?
}
