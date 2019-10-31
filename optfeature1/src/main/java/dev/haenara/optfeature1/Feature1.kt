package dev.haenara.optfeature1

import dev.haenara.core.FeatureInterface
import dev.haenara.core.FeatureModule

class Feature1 : FeatureModule {
    override fun getFeature(): FeatureInterface {
        return object : FeatureInterface {
            override fun getValue(): Any = "Hello Feature1"
        }
    }
}