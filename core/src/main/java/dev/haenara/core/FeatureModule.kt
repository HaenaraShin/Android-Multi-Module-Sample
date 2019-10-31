package dev.haenara.core

interface FeatureModule {
    fun getFeature(): FeatureInterface
}

interface FeatureInterface {
    fun getValue(): Any
}