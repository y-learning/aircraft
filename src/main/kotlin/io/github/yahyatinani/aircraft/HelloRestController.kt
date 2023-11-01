package io.github.yahyatinani.aircraft

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloRestController {
  @GetMapping("/hello")
  fun hello() = "Hello REST!"
}
