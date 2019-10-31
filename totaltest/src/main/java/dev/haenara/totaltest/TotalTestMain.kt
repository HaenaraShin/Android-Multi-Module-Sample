package dev.haenara.totaltest

import dev.haenara.essential.MultiModuleCommonActivity
import dev.haenara.optfeature1.Feature1
import dev.haenara.optfeature2.Feature2

class TotalTestMain : MultiModuleCommonActivity() {
    override fun getFeature1Value(): String? =
        Feature1().getFeature().getValue().let {
            return if (it is String) {
                it
            } else null
        }

    override fun getFeature2Value(): String? =
        Feature2().getFeature().getValue().let {
            return if (it is String) {
                it
            } else null
        }
}
