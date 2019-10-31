package dev.haenara.optfeature2

import dev.haenara.core.FeatureInterface
import dev.haenara.core.FeatureModule

class Feature2 : FeatureModule {
    override fun getFeature(): FeatureInterface {
        return object : FeatureInterface {
            override fun getValue(): Any = "Hello Feature2"
        }
    }
}