package io.github.yahyatinani.aircraft

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AircraftApplication

fun main(args: Array<String>) {
  runApplication<AircraftApplication>(*args)
}
