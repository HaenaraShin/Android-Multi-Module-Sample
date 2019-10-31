package dev.haenara.customer

import dev.haenara.essential.MultiModuleCommonActivity
import dev.haenara.optfeature2.Feature2

class CustomerMain : MultiModuleCommonActivity() {
    override fun getFeature1Value(): String? = null

    override fun getFeature2Value(): String? =
        Feature2().getFeature().getValue().let {
            return if (it is String) {
                it
            } else null
        }
}