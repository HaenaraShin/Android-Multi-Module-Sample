package dev.haenara.production

import dev.haenara.essential.MultiModuleCommonActivity
import dev.haenara.optfeature1.Feature1

class ProductionMainActivity : MultiModuleCommonActivity() {
    override fun getFeature1Value(): String? {
        Feature1().getFeature().getValue().let {
            return if (it is String) {
                it
            } else null
        }
    }
    override fun getFeature2Value(): String? = null
}