package com.github.depth401.ioma

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IomaApplication

fun main(args: Array<String>) {
	runApplication<IomaApplication>(*args)
}
