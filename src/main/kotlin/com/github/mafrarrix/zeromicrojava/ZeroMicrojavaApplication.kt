package com.github.mafrarrix.zeromicrojava

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ZeroMicrojavaApplication

fun main(args: Array<String>) {
    runApplication<ZeroMicrojavaApplication>(*args)
}
