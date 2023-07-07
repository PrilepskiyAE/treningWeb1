package com.prilepskiy.treningWeb1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class TreningWeb1Application

fun main(args: Array<String>) {
	runApplication<TreningWeb1Application>(*args)
}
