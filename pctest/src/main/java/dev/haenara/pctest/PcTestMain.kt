package dev.haenara.pctest

import dev.haenara.core.CoreModule

fun main(args: Array<String>){
    PcTestMain().start()
}

class PcTestMain {
    fun start() {
        println(CoreModule.getHelloString())
    }
}